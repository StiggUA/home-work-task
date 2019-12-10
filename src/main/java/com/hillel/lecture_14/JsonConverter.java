package com.hillel.lecture_14;

import java.util.*;

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
        Address address = new Address();
        Friend friend = new Friend();
        address.setCity("New-York");
        address.setStreet("Brooklyn 75");

        users.setId(5);
        users.setFirstName("Steve");
        users.setLastName("Rogers");
        users.setAge(99);
        users.setGender("male");
        users.setCompany("Avengers");
        users.setEmail("steve@avengers.com");
        users.setPhone(Arrays.asList("\"+19-123-136-35-48\",\"+19-916-812-99-00\""));
        users.setAddress(address);
        users.setFriends(Arrays.asList(friend));


//        TODO implements result
        String result = "";
        String start = "\"{";
        String finish = "]}\"";
        String quotes = "\"";
//        String list1Start = "\":[\"";
//        String list1Finish = "\"],";

        Map<String, String> userMap = new HashMap<>();
        userMap.put("id", String.valueOf(users.getId()));
        userMap.put("firstName", users.getFirstName());
        userMap.put("lastName", users.getLastName());
        userMap.put("age", String.valueOf(99));
        userMap.put("gender", users.getGender());
        userMap.put("company", users.getCompany());
        userMap.put("email", users.getEmail());
        userMap.put("phone", String.valueOf(users.getPhone()));
        userMap.put("address", String.valueOf(users.getAddress()));
        userMap.put("friends", String.valueOf(friend.toString()));

        Set<Map.Entry<String, String>> entries = userMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String json = quotes + entry.getKey() + quotes + ":" + quotes + entry.getValue() + quotes + ",";
            if (entry.getKey().equalsIgnoreCase("phone")) {
                json = quotes + entry.getKey() + quotes + ":"  + entry.getValue() + ",";
            }
            if (entry.getKey().equalsIgnoreCase("address")){
                json = entry.getValue();
            }
            if (entry.getKey().equalsIgnoreCase("friends")){
                json = entry.getValue();
            }
            result += json;
        }
        return start + result + finish;
    }
}