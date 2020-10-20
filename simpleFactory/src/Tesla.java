public class Tesla implements Car{

    public Tesla(){
        produce();
    }
    @Override
    public void produce() {
        System.out.println("A Tesla has been produced!");
    }
}
