package com.hillel.lecture_14;

import java.util.*;

/**
 * Create json converter. User object should be present in key-value pair, all field should be like Map;
 * F.E:
 * public class User {
 * <p>
 * private String name;
 * <p>
 * }
 * <p>
 * Should be present as json {"name": "bob"}
 *
 * @see <a href="https://www.w3schools.com/whatis/whatis_json.asp">JSON</a>
 */
public class JsonConverter {


    public String convertToJsonString(List<User> users) {
//        TODO implements result
        String result = "";
        String quotes = "\"";
        User bobMarleyUser = new User();
        bobMarleyUser.setId(1);
        bobMarleyUser.setFirstName("Bob");
        bobMarleyUser.setLastName("Marley");
        bobMarleyUser.setAge(22);
        bobMarleyUser.setGender("male");
        bobMarleyUser.setCompany("BALOOBA");
        bobMarleyUser.setEmail("knoxavery@balooba.com");

        List<String> phones = Arrays.asList("+38-096-123-26-48", "+38-093-812-12-32");
        bobMarleyUser.setPhone(phones);

        Address address = new Address();
        address.setCity("Dnipro");
        address.setStreet("Gagarina 35");

        bobMarleyUser.setAddress(address);

        Friend eatonBarlow = new Friend();
        eatonBarlow.setId(2);
        eatonBarlow.setFirstName("Eaton");
        eatonBarlow.setLastName("Barlow");

        Friend milagrosFletcher = new Friend();
        milagrosFletcher.setId(3);
        milagrosFletcher.setFirstName("Milagros");
        milagrosFletcher.setLastName("Fletcher");

        Friend morrisGrimes = new Friend();
        morrisGrimes.setId(4);
        morrisGrimes.setFirstName("Morris");
        morrisGrimes.setLastName("Grimes");

        bobMarleyUser.setFriends(Arrays.asList(eatonBarlow, milagrosFletcher, morrisGrimes));

        User steveRogers = new User();
        steveRogers.setId(5);
        steveRogers.setFirstName("Steve");
        steveRogers.setLastName("Rogers");
        steveRogers.setAge(99);
        steveRogers.setGender("male");
        steveRogers.setCompany("Avengers");
        steveRogers.setEmail("steve@avengers.com");

        List<String> stevePhones = Arrays.asList("+19-123-136-35-48", "+19-916-812-99-00");
        steveRogers.setPhone(stevePhones);

        Address steveAddress = new Address();
        steveAddress.setCity("New-York");
        steveAddress.setStreet("Brooklyn 75");

        steveRogers.setAddress(steveAddress);

        Friend tonyStark = new Friend();
        tonyStark.setId(6);
        tonyStark.setFirstName("Tony");
        tonyStark.setLastName("Stark");

        Friend natashaRomanova = new Friend();
        natashaRomanova.setId(7);
        natashaRomanova.setFirstName("Natasha");
        natashaRomanova.setLastName("Romanova");

        Friend thor = new Friend();
        thor.setId(8);
        thor.setFirstName("Thor");
        thor.setLastName("Son of Oddin");

        steveRogers.setFriends(Arrays.asList(tonyStark, natashaRomanova, thor));

        Map<String, String> userMap = new HashMap<>();
        userMap.put("id", String.valueOf(bobMarleyUser.getId()));
        userMap.put("firstName", bobMarleyUser.getFirstName());
        userMap.put("lastName", bobMarleyUser.getLastName());
        userMap.put("age", String.valueOf(bobMarleyUser.getAge()));
        userMap.put("gender", bobMarleyUser.getGender());
        userMap.put("company", bobMarleyUser.getCompany());
        userMap.put("email", bobMarleyUser.getEmail());
        userMap.put("phone", String.valueOf(bobMarleyUser.getPhone()));
        userMap.put("address", String.valueOf(bobMarleyUser.getAddress()));
        userMap.put("friends", String.valueOf(bobMarleyUser.getFriends(eatonBarlow)));
        userMap.put("friends", String.valueOf(bobMarleyUser.getFriends(milagrosFletcher)));
        userMap.put("friends", String.valueOf(bobMarleyUser.getFriends(morrisGrimes)));
        userMap.put("Steveid", String.valueOf(steveRogers.getId()));


        Set<Map.Entry<String, String>> entries = userMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String json = quotes + entry.getKey() + quotes + ":" + quotes + entry.getValue() + quotes + ",";
            if (entry.equals("Steveid")) {
                json = quotes + "id" + quotes + ":" + quotes + entry.getValue() + quotes + ",";
            }
            result += json.trim();
        }


        return result;
    }

    public String convertToJsonString(User users) {
        User steveRogers = new User();
        steveRogers.setId(5);
        steveRogers.setFirstName("Steve");
        steveRogers.setLastName("Rogers");
        steveRogers.setAge(99);
        steveRogers.setGender("male");
        steveRogers.setCompany("Avengers");
        steveRogers.setEmail("steve@avengers.com");

        List<String> stevePhones = Arrays.asList("\"+19-123-136-35-48\"", "\"+19-916-812-99-00\"");
        steveRogers.setPhone(stevePhones);

        Address steveAddress = new Address();
        steveAddress.setCity("New-York");
        steveAddress.setStreet("Brooklyn 75");
        steveRogers.setAddress(steveAddress);

        Friend tonyStark = new Friend();
        tonyStark.setId(6);
        tonyStark.setFirstName("Tony");
        tonyStark.setLastName("Stark");

        Friend natashaRomanova = new Friend();
        natashaRomanova.setId(7);
        natashaRomanova.setFirstName("Natasha");
        natashaRomanova.setLastName("Romanova");

        Friend thor = new Friend();
        thor.setId(8);
        thor.setFirstName("Thor");
        thor.setLastName("Son of Oddin");

        steveRogers.setFriends(Arrays.asList(tonyStark, natashaRomanova, thor));
//        TODO implements result
        String result = "";
        String start = "\"{";
        String finish = "}\"";
        String quotes = "\"";

        Map<String, String> userMap = new LinkedHashMap<>();
        userMap.put("id", String.valueOf(steveRogers.getId()));
        userMap.put("firstName", steveRogers.getFirstName());
        userMap.put("lastName", steveRogers.getLastName());
        userMap.put("age", String.valueOf(steveRogers.getAge()));
        userMap.put("gender", steveRogers.getGender());
        userMap.put("company", steveRogers.getCompany());
        userMap.put("email", steveRogers.getEmail());
        userMap.put("phone", String.valueOf(steveRogers.getPhone()).replace(" ", ""));
        userMap.put("address", String.valueOf(steveRogers.getAddress()));
        userMap.put("friends", String.valueOf(steveRogers.getFriends(tonyStark)).replace(" {", "{"));


        Set<Map.Entry<String, String>> entries = userMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String json = quotes + entry.getKey() + quotes + ":" + quotes + entry.getValue() + quotes + ",";
            if (entry.getKey().equalsIgnoreCase("id") || entry.getKey().equals("age")) {
                json = quotes + entry.getKey() + quotes + ":" + entry.getValue() + ",";
            }
                if (entry.getKey().equalsIgnoreCase("phone") || entry.getKey().equalsIgnoreCase("address")) {
                    json = quotes + entry.getKey() + quotes + ":" + entry.getValue() + ",";
                }
                if (entry.getKey().equalsIgnoreCase("friends")) {
                    json = quotes + entry.getKey() + quotes + ":" + entry.getValue();
                }
                result += json;
            }
            return start + result + finish;
        }
    }



//
//        Address address = new Address();
//        Friend friend = new Friend();
//        address.setCity("New-York");
//        address.setStreet("Brooklyn 75");
//
//        users.setId(5);
//        users.setFirstName("Steve");
//        users.setLastName("Rogers");
//        users.setAge(99);
//        users.setGender("male");
//        users.setCompany("Avengers");
//        users.setEmail("steve@avengers.com");
//        users.setPhone(Arrays.asList("\"+19-123-136-35-48\",\"+19-916-812-99-00\""));
//        users.setAddress(address);
//        users.setFriends(Arrays.asList(friend));