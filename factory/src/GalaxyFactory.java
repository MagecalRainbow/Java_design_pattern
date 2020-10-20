public class GalaxyFactory implements AbstractPhoneFactory{
    @Override
    public Phone producePhone() {
        return new Galaxy();
    }
}
