public class HuaWeiFactory implements AbstractFactory{

    @Override
    public Phone producePhone() {
        return new PSeries();
    }

    @Override
    public PC producePC() {
        return new MateBook();
    }
}
