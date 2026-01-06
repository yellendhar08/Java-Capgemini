package OOPs.HASaRelation;

class Engine{
    public void start(){
        System.out.println("Engine has started");
    }
    public void stop(){
        System.out.println("Engine has stopped");
    }
}
class Car{
    private Engine engine;
    public Car(){
        engine=new Engine();
    }
    public void drive(){
        engine.start();
        System.out.println("Car has started");
    }
    public void park(){
        System.out.println("Car has parked");
        engine.stop();
    }
}
public class Composition {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.park();
    }

}
