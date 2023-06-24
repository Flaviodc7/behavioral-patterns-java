package Observer;

public class SatelliteReceptor implements Receptor{
    @Override
    public void receives() {
        System.out.println("Received signal on satellite");
    }
}
