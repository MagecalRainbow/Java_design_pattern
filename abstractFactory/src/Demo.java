public class Demo {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();

        IPhone iPhone = (IPhone)appleFactory.producePhone();
        Mac mac = (Mac) appleFactory.producePC();

        Phone pSeries = huaWeiFactory.producePhone();
        PC mateBook = huaWeiFactory.producePC();
    }
}
