package Constructor;

/*WAJP to create student class consist of 4 data such as
//id, namen percentage and  college name
create parameterized constructor to initialize only percentage
create parameterized constructor to initialize id and name
create parameterized constructor to initialize id and percentage
create parameterized constructor to initialize name and percentage
create parameterized constructor to initialize id, name, and percentage
create default/no argument constructor to asssign default values.
create one static method called printDetails to print all the details of all the students.
in main method creat objects using all constructors
*/
public class Student {

    int id ;
    String name;
    double percentage;
    String collegeName;

    public  Student(){
        System.out.println("Default Constructor");
        this.id=0;
        this.name="";
        this.percentage=0.00;
        this.collegeName="";
    }
    public Student(int id){
        System.out.println("Default Constructor");
        this.id = id;
    }
    public Student(String name){
        System.out.println("Constructor with name");
        this.name=name;
    }
    public  Student(double percentage){
        System.out.println("Constructor with percentage");
        this.percentage=percentage;
    }
    public Student(int id, String name){
        System.out.println("Constructor with ID and name");
        this.id =id;
        this.name = name;
    }
    public Student(String name, double percentage){
        System.out.println("Constructor with name and percentage");
        this.name = name;
        this.percentage = percentage;
    }
    public Student(int id, String name, double percentage){
        System.out.println("Constructor with ID, name, percentage");
        this.id = id;
        this.name = name;
        this.percentage=percentage;
    }
    public static void printDetails(Student obj){
        System.out.println("ID: "+obj.id);
        System.out.println("Name: "+obj.name);
        System.out.println("Percentage : "+obj.id);
        System.out.println("College Name: "+obj.collegeName);

    }

    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student(10);
        Student obj2 = new Student("Suraj");
        Student obj3 = new Student(97.5);
        Student obj4 = new Student(10,"Rahul");
        Student obj5 = new Student("Jeevan",95.7);
        Student obj6 = new Student(15,"Ganesh",96.9);
        printDetails(obj);
        System.out.println();
        printDetails(obj1);
        System.out.println();
        printDetails(obj2);
        System.out.println();
        printDetails(obj3);
        System.out.println();
        printDetails(obj4);
        System.out.println();
        printDetails(obj5);
        System.out.println();
        printDetails(obj6);

    }
}
