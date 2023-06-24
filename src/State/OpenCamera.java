package State;

public class OpenCamera extends State{
    public OpenCamera(Telephone telephone){
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
        telephone.changeState(new TakePhotoState(telephone));
        return "The Camera is ready";
    }
}
