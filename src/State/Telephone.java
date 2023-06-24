package State;

public class Telephone {
    public State state;

    public Telephone(){
        state = new BlockedState(this);
    }

    public void changeState(State state){
        System.out.println("Initial state: " + this.state.getClass().getName());
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
