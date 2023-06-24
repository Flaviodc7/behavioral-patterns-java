package Strategy;

import java.util.ArrayList;

public class Main {
    public static void main (String []args){
        int type = 0;

        Users users = type == 0 ? new MemoryUsers() : new FileUsers();

        create(users, "George");
        create(users, "John");
        create(users, "Gregory");

        for (String user : toList(users)){
            System.out.println(user);
        }
    }

    public static void create(Users users, String name){
        users.create(name);
    }

    public static ArrayList<String> toList(Users users){
        return users.toList();
    }
}
