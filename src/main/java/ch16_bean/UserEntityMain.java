package ch16_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();
        user1.setUsername(1);
        user1.setPassword(9876);
        user1.setEmail("a@test.com");
        user1.setName("김미진");
        System.out.println(user1);

        UserEntityLombok user2 = new UserEntityLombok();
        user2.setUsername(2);
        user2.setPassword(1357);
        user2.setEmail("b@test.com");
        user1.setName("김이");

        System.out.println("username : " + user2.getUsername());
        System.out.println("password : " + user2.getPassword());
        System.out.println("email : " + user2.getEmail());
        System.out.println("name : " + user2.getName());
    }
}
