import sun.awt.Symbol;

public class IPhone implements Phone{
    public IPhone(){
        produce();
    }

    @Override
    public void produce() {
        System.out.println(" A Apple Iphone has been produced!");
    }
}
