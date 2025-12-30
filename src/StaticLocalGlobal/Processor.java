package StaticLocalGlobal;

public class Processor {
    int x;
    int y;
    public static void main(String[] args) {
        Processor obj = new Processor();
        obj.initialize();
        obj.update();
    }
    void initialize(){
        this.x =10;
        this.y=15;
    }
    void update(){
        int x=20;
        int y=25;
        this.x =x;
        this.y=y;
        this.display();
    }
    void display(){
        System.out.println(this.x);
        System.out.println(this.y);
    }
}


