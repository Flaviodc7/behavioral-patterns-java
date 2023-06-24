package Observer;

public class RadioReceptor implements Receptor {
    @Override
    public void receives() {
        System.out.println("Received signal on Radio");
    }
}
