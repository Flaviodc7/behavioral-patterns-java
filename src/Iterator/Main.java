package Iterator;

public class Main {
    public static void main(String []args){
        Users users = new Users();
        users.create(new User("one", 34));
        users.create(new User("two", 4));
        users.create(new User("three", 25));
        users.create(new User("four", 39));

        while (users.hasMore()){
            User user = users.next();
            System.out.println("User is: " + user.getName());
        }
    }
}
