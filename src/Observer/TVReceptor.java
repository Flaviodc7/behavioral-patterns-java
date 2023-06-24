package Observer;

public class TVReceptor implements Receptor {
    @Override
    public void receives() {
        System.out.println("Received signal on TV");
    }
}
