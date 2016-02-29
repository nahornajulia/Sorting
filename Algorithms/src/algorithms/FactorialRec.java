/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author ynahorna
 */
public class FactorialRec implements Factorial {

    @Override
    public long factorial(long x) {
        if (x < 1) {
            return -1;
        }
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static void main(String[] args) {
        Factorial f = new FactorialRec();
        long factorial = f.factorial(1);
        System.out.println(factorial);
    }

}
