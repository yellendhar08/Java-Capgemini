package OOPs.Polymorphism;

public class Vehicle {
    public static void main(String[] args){
        Vehicle veh = new Vehicle();
        Car car = new Car();
        Bicycle by = new Bicycle();
        veh.speedUp();
        car.speedUp();
        by.speedUp();
    }
    public void speedUp(){
        System.out.println("Vehicle class function with speed 100kmph");
    }
}
class  Car extends Vehicle{
    public  void speedUp(){
        System.out.println("Over-rided to car with speed 120kmph");
    }
}
class Bicycle extends Vehicle{
    public  void speedUp(){
        System.out.println("Over-rided to Bicycle with speed 50kmph");
    }
}
