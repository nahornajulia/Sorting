package scvproject;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author ynahorna
 */
public class CSVRecordImpl implements CSVRecord {

    private String[] fieldsArray;
    public static Map<String, Integer> mapPosition = new HashMap<>();

    public CSVRecordImpl(String line) {
        fieldsArray = line.split(",");
    }
    @Override
    public String getField(String name) {
        return fieldsArray[mapPosition.get(name)];
    }
}
