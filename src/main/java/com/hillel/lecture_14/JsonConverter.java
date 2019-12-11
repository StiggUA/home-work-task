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
        User bobMarleyUser = new User();
        bobMarleyUser.setId(1);
        bobMarleyUser.setFirstName("Bob");
        bobMarleyUser.setLastName("Marley");
        bobMarleyUser.setAge(22);
        bobMarleyUser.setGender("male");
        bobMarleyUser.setCompany("BALOOBA");
        bobMarleyUser.setEmail("knoxavery@balooba.com");

        List<String> phones = Arrays.asList("\"+38-096-123-26-48\"","\"+38-093-812-12-32\"");
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

        String start = "\"[{";
        String finish = "}]\"";
        String quotes = "\"";
        String steveStart = ",{";
        String end = "}";

        Map<String, String> userMap1 = new LinkedHashMap<>();
        userMap1.put("id", String.valueOf(bobMarleyUser.getId()));
        userMap1.put("firstName", bobMarleyUser.getFirstName());
        userMap1.put("lastName", bobMarleyUser.getLastName());
        userMap1.put("age", String.valueOf(bobMarleyUser.getAge()));
        userMap1.put("gender", bobMarleyUser.getGender());
        userMap1.put("company", bobMarleyUser.getCompany());
        userMap1.put("email", bobMarleyUser.getEmail());
        userMap1.put("phone", String.valueOf(bobMarleyUser.getPhone()).replace(" ", ""));
        userMap1.put("address", String.valueOf(bobMarleyUser.getAddress()));
        userMap1.put("friends", String.valueOf(bobMarleyUser.getFriends(eatonBarlow)).replace(" {", "{"));
        userMap1.put("friends", String.valueOf(bobMarleyUser.getFriends(milagrosFletcher)).replace(" {", "{"));
        userMap1.put("friends", String.valueOf(bobMarleyUser.getFriends(morrisGrimes)).replace(" {", "{"));

        userMap1.put("SteveId", String.valueOf(steveRogers.getId()));
        userMap1.put("StevefirstName", steveRogers.getFirstName());
        userMap1.put("StevelastName", steveRogers.getLastName());
        userMap1.put("Steveage", String.valueOf(steveRogers.getAge()));
        userMap1.put("Stevegender", steveRogers.getGender());
        userMap1.put("Stevecompany", steveRogers.getCompany());
        userMap1.put("Steveemail", steveRogers.getEmail());
        userMap1.put("Stevephone", String.valueOf(steveRogers.getPhone()).replace(" ", ""));
        userMap1.put("Steveaddress", String.valueOf(steveRogers.getAddress()));
        userMap1.put("Stevefriends", String.valueOf(steveRogers.getFriends(tonyStark)).replace(" {", "{"));



        Set<Map.Entry<String, String>> entries = userMap1.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String json = quotes + entry.getKey() + quotes + ":" + quotes + entry.getValue() + quotes + ",";
            if (entry.getKey().equalsIgnoreCase("id") || entry.getKey().equals("age")) {
                json = quotes + entry.getKey() + quotes + ":" + entry.getValue() + ",";
            }
            if (entry.getKey().equalsIgnoreCase("phone") || entry.getKey().equalsIgnoreCase("address")) {
                json = quotes + entry.getKey() + quotes + ":" + entry.getValue() + ",";
            }
            if (entry.getKey().equalsIgnoreCase("friends")) {
                json = quotes + entry.getKey() + quotes + ":" + entry.getValue() + end;
            }
            if (entry.getKey().equals("SteveId")){
                json = steveStart + quotes + entry.getKey().replace("SteveId", "id") + quotes  + ":" + entry.getValue()+ ",";
            }
            if (entry.getKey().equals("StevefirstName")){
                json = quotes + entry.getKey().replace("StevefirstName", "firstName") + quotes + ":" +  quotes + entry.getValue() +  quotes + ",";
            }
            if (entry.getKey().equals("StevelastName")){
                json = quotes + entry.getKey().replace("StevelastName", "lastName") + quotes + ":" +  quotes + entry.getValue() +  quotes + ",";
            }
            if (entry.getKey().equals("Steveage")){
                json = quotes + entry.getKey().replace("Steveage", "age") + quotes + ":" + entry.getValue() + ",";
            }
            if (entry.getKey().equals("Stevegender")){
                json = quotes + entry.getKey().replace("Stevegender", "gender") + quotes + ":" +  quotes + entry.getValue() +  quotes + ",";
            }
            if (entry.getKey().equals("Stevecompany")){
                json = quotes + entry.getKey().replace("Stevecompany", "company") + quotes + ":" +  quotes + entry.getValue() +  quotes + ",";
            }
            if (entry.getKey().equals("Steveemail")){
                json = quotes + entry.getKey().replace("Steveemail", "email") + quotes + ":" +  quotes + entry.getValue() +  quotes + ",";
            }
            if (entry.getKey().equals("Stevephone")){
                json = quotes + entry.getKey().replace("Stevephone", "phone") +  quotes + ":"  + entry.getValue() + ",";
            }
            if (entry.getKey().equals("Steveaddress")){
                json = quotes + entry.getKey().replace("Steveaddress", "address") +  quotes + ":" + entry.getValue() + ",";
            }
            if (entry.getKey().equals("Stevefriends")){
                json = quotes + entry.getKey().replace("Stevefriends", "friends") +  quotes + ":" + entry.getValue();
            }
            result += json.trim();
        }


        return start + result + finish;
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