package State;

abstract public class State {
    public Telephone telephone;

    public State(Telephone telephone){
        this.telephone = telephone;
    }

    abstract public String unlock();
    abstract public String openCamera();
    abstract public String takePhoto();
}
