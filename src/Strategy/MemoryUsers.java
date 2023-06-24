package Strategy;

import java.util.ArrayList;

public class MemoryUsers implements Users{
    private ArrayList<String> users = new ArrayList();

    @Override
    public void create(String name){
        users.add(name);
    }

    @Override
    public ArrayList<String> toList(){
        return users;
    }
}
