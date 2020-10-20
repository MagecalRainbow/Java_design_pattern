public class CarFactory {
    public Car produceATesla(){
        return new Tesla();
    }
    public Car produceABenz(){
        return new Benz();
    }
}
