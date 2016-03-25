package scvproject;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author ynahorna
 */
public class CSVSearchImpl implements CSVSearch {

    private String name, content;
    private Map<String, CSVRecord> map;

    public CSVSearchImpl(String content, String name) {
        this.name = name;
        this.content = content;
//Validate the name
        String[] lines = content.split("\n");

        String firstLine = lines[0];
        String[] fields = firstLine.split(",");
//Initiallizing sttaic csv record field position map
        for (int l = 0; l < fields.length; l++) {
            CSVRecordImpl.mapPosition.put(fields[l], l);
        }
            map = new HashMap<>();
            for (int k = 1; k < lines.length; k++) {
                String key = lines[k].split(",")[1];
                map.put(key, new CSVRecordImpl(lines[k]));
            }
    }

    @Override
    public CSVRecord find(String key) {
        return map.get(key);
    }
}
