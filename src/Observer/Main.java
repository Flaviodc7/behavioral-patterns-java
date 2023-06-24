package Observer;

public class Main {
    public static void main(String []args){
        Transmitter transmitter = new Transmitter();
        TVReceptor tvReceptor = new TVReceptor();
        SatelliteReceptor satelliteReceptor = new SatelliteReceptor();

        transmitter.putReceptor(tvReceptor);
        transmitter.putReceptor(satelliteReceptor);

        transmitter.emit();
    }
}
