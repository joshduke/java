package learning.java.features.java8.streams;

import java.util.List;

public class MapFlatMapDemo {

    public static void main(String[] args) {
        UserData user1 = new UserData("Harry", List.of("harry.d@gmail", "harry.b@msn"));
        UserData user2= new UserData("James", List.of("james.m@gmail", "james.g@msn"));
        List<UserData> users = List.of(user1, user2);
        users.stream().map(UserData::getUserName).forEach(System.out::println);
        users.stream().flatMap(userData -> userData.getEmailIds().stream()).forEach(System.out::println);
    }

}



class UserData {

    private String userName;

    private List<String> emailIds;

    UserData(String name, List<String> emailIds) {
        this.userName = name;
        this.emailIds = emailIds;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setEmailIds(List<String> emailIds) {
        this.emailIds = emailIds;
    }

    public List<String> getEmailIds() {
        return emailIds;
    }
}