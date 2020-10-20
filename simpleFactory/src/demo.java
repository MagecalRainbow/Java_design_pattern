public class demo {
    public static void main(String[] args) {
        CarFactory carFactory= new CarFactory();
        Tesla newTesla = (Tesla) carFactory.produceATesla();
        Car newBenz = carFactory.produceABenz();
    }
}
