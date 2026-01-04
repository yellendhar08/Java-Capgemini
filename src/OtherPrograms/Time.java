package OtherPrograms;

public class Time {

    static{
        System.out.println("Static block");
    }
    public Time(int a){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        Time ref = new Time(10);
        System.out.println("Main End");
    }
}

