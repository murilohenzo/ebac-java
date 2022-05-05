import entities.User;
import services.UserServices;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("murilo", 23);
        User user2 = new User("henzo", 23);
        User user3 = new User("mateus", 26);
        User user4 = new User("luiz", 26);
        User user5 = new User("cris", 28);

        UserServices userServices = new UserServices();
        userServices.addUser(user1);
        userServices.addUser(user2);
        userServices.addUser(user3);
        userServices.addUser(user4);
        userServices.addUser(user5);

        System.out.println("**** FIND ALL USERS ****");
        System.out.println(userServices.findAll());
        userServices.remove(user5);
        System.out.println("**** REMOVE USER ****");
        System.out.println(userServices.findAll());
        System.out.println("**** FIND BY ID ****");
        System.out.println(userServices.findById(1));
        System.out.println("**** FIND BY NAME ****");
        System.out.println(userServices.findByName("murilo"));
    }
}