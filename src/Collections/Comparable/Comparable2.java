package Collections.Comparable;

import java.util.*;
public class Comparable2{
    public static void main(String[] args){
        ArrayList<Student> student = new ArrayList<>();

        student.add(new Student(101, "Alice",85));
        student.add(new Student(102, "Bob",72));
        student.add(new Student(103, "Charlie",90));
        student.add(new Student(104, "Diana",78));

        System.out.println("Students before sorting:");
        for(Student e : student){
            System.out.println(e);
        }
        Collections.sort(student);
        System.out.println();
        System.out.println("Students after sorting:");
        for(Student e : student){
            System.out.println(e);
        }
    }
}

class Student implements Comparable<Student> {
    private int roll;
    private String name;
    private int marks;

    public Student(int roll, String name, int marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
    public int getR(){
        return roll;
    }
    public String getN(){
        return name;
    }
    public int getM(){
        return marks;
    }
    public String toString(){
        return "RollNo: "+roll+", Name: "+name+", Marks: "+marks;
    }
    public int compareTo(Student s){
        return Integer.compare(this.marks, s.marks);
    }

}