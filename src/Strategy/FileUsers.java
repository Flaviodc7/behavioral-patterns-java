package Strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUsers implements Users{
    private String usersFile = "users.txt";
    private PrintStream file;
    public void fileUsers(){
        try {
            file = new PrintStream(usersFile);
        } catch (Exception e){
            System.out.println("Can't open file" + e.getMessage());
        }
    }
    @Override
    public void create(String name){
        file.println(name);
    }
    @Override
    public ArrayList<String> toList(){
        ArrayList<String> users = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(usersFile));

            while (scanner.hasNext()){
                users.add(scanner.next());
            }

            scanner.close();
        } catch (Exception e){
            System.out.println("Error reading: " + e.getMessage());
        }

        return users;
    }
}
