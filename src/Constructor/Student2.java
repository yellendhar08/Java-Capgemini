package Constructor;

public class Student2 {
    int id;
    String name;
    int[] marks;
    public Student2(int id, String name, int[] marks){
        this.id =id;
        this.name=name;
        this.marks = marks;
    }
    public Student2(Student2 obj){
        this.id=obj.id;
        this.name= obj.name;
        this.marks = obj.marks;
    }
    public static void main(String[] args) {
        int[] marks ={76,88,95};
        Student2 ref1 = new Student2(10,"Rahul",marks);
        Student2 ref2 = new Student2(ref1);

        ref2.marks = new int[]{90,86,77};
        System.out.println("Details of first Constructor: ");
        System.out.println("ID: "+ref1.id);
        System.out.println("Name: "+ref1.name);
        System.out.print("Marks: ");
        for(int x: ref1.marks){
            System. out.print(x+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Details of Copy Constructor: ");
        System.out.println("Copy ID: "+ref2.id);
        System.out.println("Copy Name: "+ref2.name);
        System.out.print("Updated Marks: ");
        for(int x : ref2.marks){
            System.out.print(x+" ");
        }


    }
}
