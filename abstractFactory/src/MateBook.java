public class MateBook implements PC {

    public MateBook(){
        produce();
    }
    @Override
    public void produce() {
        System.out.println("A HuaWei MateBook has been produced!");
    }
}
