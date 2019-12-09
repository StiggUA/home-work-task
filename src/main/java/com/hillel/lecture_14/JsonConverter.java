package com.hillel.lecture_14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Create json converter. User object should be present in key-value pair, all field should be like Map;
 * F.E:
 * public class User {
 *
 *     private String name;
 *
 * }
 *
 * Should be present as json {"name": "bob"}
 * @see <a href="https://www.w3schools.com/whatis/whatis_json.asp">JSON</a>
 */
public class JsonConverter {


    public String convertToJsonString(List<User> users) {

//        TODO implements result
        String result = "";

        return result;
    }

    public String convertToJsonString(User users) {

//        TODO implements result
        String result = "";
        String start = "\"{";
        String finish = "\"}";
        String quotes = "\"";
        String list1Start = "\":[\"";
        String list1Finish = "\"],";
//        String comma = ",";
//        String addressStart = "\":{\"";
//        String addressFinish = "\"},";
        Map<String, String> userMap = new HashMap<>();
        userMap.put("id", String.valueOf(5));
        userMap.put("firstName", "Steve");
        userMap.put("lastName", "Rogers");
        userMap.put("age", String.valueOf(99));
        userMap.put("gender", "male");
        userMap.put("company", "Avengers");
        userMap.put("email", "steve @avengers.com");
        userMap.put("phone", "+19-123-136-35-48\",\"+19-916-812-99-00");

        Set<Map.Entry<String, String>> entries = userMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String row = quotes + entry.getKey() + quotes + ":" + quotes + entry.getValue() + quotes + ",";
            if (entry.getKey().equalsIgnoreCase("phone")) {
                row = quotes + entry.getKey() + list1Start + entry.getValue() + list1Finish;
            }
//            Map<String, String> address = new HashMap<>();
//            String addressStart = "\":{\"";
//            String addressFinish = "\"},";
//            address.put("address", "");
//            address.put("city", "New-York");
//            address.put("street", "Brooklyn 75");
//            Set<Map.Entry<String, String>> entries1 = userMap.entrySet();
//            for (Map.Entry<String, String> entry1 : entries) {
//                row = quotes + entry.getKey() + quotes + ":" + quotes + entry.getValue() + quotes + ",";
//                if (entry.getKey().equalsIgnoreCase("address")) {
//                    row = entry1.getKey() + addressStart;
//                }
//            }
            result += row;
        }
        return start + result + finish;
    }
}
//            if (entry.getKey().equalsIgnoreCase("address")) {
//                Map<String, String> address = new HashMap<>();
//                //address.put("address", "");
//                address.put("city", "New-York");
//                address.put("street", "Brooklyn 75");
//                row = quotes + entry.getKey() + addressStart + entry.getValue() + entry.getValue();
//            }
//            if (entry.getKey().equalsIgnoreCase("street")) {
//                row = quotes + entry.getKey() + quotes + ":" + quotes + entry.getValue() + addressFinish;
//            }