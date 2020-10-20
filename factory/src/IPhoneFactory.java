public class IPhoneFactory implements AbstractPhoneFactory {
    @Override
    public Phone producePhone() {
        return new IPhone();
    }

}
