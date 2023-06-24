package State;

public class UnlockedState extends State{
    public UnlockedState(Telephone telephone){
        super(telephone);
    }

    @Override
    public String unlock() {
        return "The phone is already unlocked";
    }

    @Override
    public String openCamera() {
        telephone.changeState(new OpenCamera(telephone));
        return "Open Camera";
    }

    @Override
    public String takePhoto() {
        return null;
    }
}
