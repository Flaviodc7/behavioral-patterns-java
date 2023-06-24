package State;

public class BlockedState extends State{
    public BlockedState(Telephone telephone){
        super(telephone);
    }

    @Override
    public String unlock() {
        telephone.changeState(new UnlockedState(telephone));
        return "Unlocked Phone";
    }

    @Override
    public String openCamera() {
        return null;
    }

    @Override
    public String takePhoto() {
        return null;
    }
}
