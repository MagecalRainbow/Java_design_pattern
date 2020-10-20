public class IPhone implements Phone{
    public IPhone(){
        produce();
    }
    @Override
    public void produce() {
        System.out.println("A IPhone has been produced!");
    }
}
