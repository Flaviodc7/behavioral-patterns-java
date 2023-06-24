package State;

public class TakePhotoState extends State{
    public TakePhotoState(Telephone telephone){
        super(telephone);
    }

    @Override
    public String unlock() {
        return null;
    }

    @Override
    public String openCamera() {
        return null;
    }

    @Override
    public String takePhoto() {
        telephone.changeState(new BlockedState(telephone));
        return "The photo has been taken";
    }
}
