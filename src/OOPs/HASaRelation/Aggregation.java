package OOPs.HASaRelation;

class Enigine2{
    String type;
    public  Enigine2(String type){
        this.type=type;
    }
}
class  Car2{
    Enigine2 engine;
    public Car2(Enigine2 engine){
        this.engine=engine;
    }
    public void display(){
        System.out.println("Engine name: "+engine.type);
    }



}
public class Aggregation {
    public static void main(String[] args) {
        Enigine2 enigine = new Enigine2("V8");
        Car2 car = new Car2(enigine);
        car.display();
    }
}
