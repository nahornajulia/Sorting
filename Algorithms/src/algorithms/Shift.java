package algorithms;

import java.util.Arrays;

/**
 *
 * @author ynahorna
 */
public class Shift {

    public static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private void shift(int[] array, int shift) {
        //1. Temp buffer length
        int buffLen = (shift > 0) ? shift % array.length : array.length + shift % array.length;

        //2. Create temp buffer
        int[] bufferedArray = new int[buffLen];
        //3. Fill up the temp buffer
        for (int i = 0; i < buffLen; i++) {
            bufferedArray[i] = array[i];
        }
        //4.Move the elements
        for (int k = 0; k < array.length - buffLen; k++) {
            array[k] = array[buffLen + k];
        }
        //5. Use the buffer
        int offset = array.length - buffLen;
        for (int l = 0; l < buffLen; l++) {
            array[offset + l] = bufferedArray[l];
        }
        /* Another implementation
         for(int j = array.length - buffLen; j < array.length; j++){
         array[j] = bufferedArray[j- (array.length - buffLen) ];
         }
         */
        System.out.println(Arrays.toString(array));
    }

    public void shiftLeft(int[] array, int shift) {
        shift(array, shift);
    }

    public void shiftRight(int[] array, int shift) {
        shift(array, -shift);
    }

    public static void main(String[] args) {
        Shift s = new Shift();
        s.shiftRight(array, 3);
        s.shiftLeft(array, 3);
    }
}
