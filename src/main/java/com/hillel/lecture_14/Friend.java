package com.hillel.lecture_14;

/**
 * Created by alpa on 12/9/19
 */
public class Friend {

    private Integer id;
    private String firstName;
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id + "," +
                "\"firstName\":" + "\"" + firstName + "\"" + "," +
                "\"lastName\":" + "\"" + lastName + "\"" + "}";
//                "{\"id\":" + id + "," +
//                "\"firstName\":" + "\"" + firstName + "\"" + "," +
//                "\"lastName\":" + "\"" + lastName + "\"" + "}," +
//                "{\"id\":" + id + "," +
//                "\"firstName\":" + "\"" + firstName + "\"" + "," +
//                "\"lastName\":" + "\"" + lastName + "\"" + "}";
    }
}
//@Override
//    public String toString() {
//        return "\"friends\":[{" +
//                "\"id\":" + 6 + "," +
//                "\"firstName\":" + "\"" + "Tony" +"\"" + "," +
//                "\"lastName\":" + "\"" + "Stark"+ "\"" + "}," +
//                "{\"id\":" + 7 +  "," +
//                "\"firstName\":" + "\"" + "Natasha" +"\"" + "," +
//                "\"lastName\":" + "\"" + "Romanova"+ "\"" + "}," +
//                "{\"id\":" + 8 +  "," +
//                "\"firstName\":" + "\"" + "Thor" +"\"" + "," +
//                "\"lastName\":" + "\"" + "Son of Oddin" + "\"" +"}";
//    }