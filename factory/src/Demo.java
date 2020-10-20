public class Demo {
    public static void main(String[] args) {
        AbstractPhoneFactory iPhoneFactory =  new IPhoneFactory();
        AbstractPhoneFactory galaxyFactory = new GalaxyFactory();
        Phone newIPhone = iPhoneFactory.producePhone();
        Galaxy newGalaxy = (Galaxy) galaxyFactory.producePhone();
    }
}
