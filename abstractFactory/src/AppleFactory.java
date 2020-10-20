public class AppleFactory implements AbstractFactory{
    @Override
    public Phone producePhone() {
        return new IPhone();
    }

    @Override
    public PC producePC() {
        return new Mac();
    }
}
