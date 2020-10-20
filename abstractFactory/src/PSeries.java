public class PSeries implements Phone{

    public PSeries(){
        produce();
    }
    @Override
    public void produce() {
        System.out.println("A HuaWei PSeries Phone has been produced!");
    }
}
