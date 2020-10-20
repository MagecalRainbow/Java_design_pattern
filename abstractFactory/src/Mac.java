public class Mac implements  PC{

    public Mac(){
        produce();
    }
    @Override
    public void produce() {
        System.out.println("A Apple Mac has been Produced!");
    }
}
