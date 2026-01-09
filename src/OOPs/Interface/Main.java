package OOPs.Interface;

class  Person{
    public void showRole(){
        System.out.println("I am a person");
    }
}
class Student extends Person{

}
class Teacher extends Person{

}
interface  Sports{
    abstract public void play();
}
interface Cultural{
    abstract public void perform();
}
class CollegeStudent extends Student implements Sports, Cultural{
    public void play(){
        System.out.println("Sports method over ride");
    }
    public void perform(){
        System.out.println("Cultural method over ride");
    }
}
public class Main {
    public static void main(String[] args) {
        CollegeStudent obj = new CollegeStudent();
        obj.showRole();
        obj.play();
        obj.perform();

    }
}
