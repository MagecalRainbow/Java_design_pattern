import javax.sound.midi.SysexMessage;

public class Benz implements Car{
    public Benz(){
        produce();
    }
    @Override
    public void produce() {
        System.out.println("A Benz  has been produced!");
    }
}
