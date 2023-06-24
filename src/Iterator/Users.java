package Iterator;

import java.util.ArrayList;
import java.util.LinkedList;

public class Users implements IteratorUser{
    private LinkedList<User> users = new LinkedList<>();
    private int position = 0;

    public void create(User user){
        users.add(user);
    }
    @Override
    public User next(){
        User user = this.users.get(position);
        position++;
        return user;
    }

    @Override
    public boolean hasMore(){
        return position < users.size();
    }

    @Override
    public void reset() {
        position = 0;
    }
}
