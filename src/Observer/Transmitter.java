package Observer;

import java.util.ArrayList;

public class Transmitter {
    private ArrayList<Receptor> receptor = new ArrayList<>();

    public void putReceptor(Receptor receptor){
        this.receptor.add(receptor);
    }

    public void emit(){
        for (Receptor receptor : receptor){
            receptor.receives();
        }
    }
}
