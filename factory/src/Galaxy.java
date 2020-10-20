public class Galaxy implements Phone{
    public Galaxy(){
        produce();
    }
    @Override
    public void produce() {
        System.out.println("A Galaxy a been produced!");
    }
}
