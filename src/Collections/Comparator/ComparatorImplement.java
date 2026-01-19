package Collections.Comparator;

import  java.util.*;
public class ComparatorImplement {
    public static void main(String[] args) {
        List<Students> st = new ArrayList<>();
        st.add(new Students(101,"Anjali",85.5));
        st.add(new Students(102,"Ramu",73.9));
        st.add(new Students(103,"Charan",65.5));
        st.add(new Students(104,"Kiran",82.8));

        System.out.println("Sorted By name: ");
        Collections.sort(st, new SortName());

        for(Students s : st){
            System.out.println(s);
        }

        System.out.println("\nSorted By Marks: ");
        Collections.sort(st, new SortMarks());

        for(Students s : st){
            System.out.println(s);
        }
    }
}
class Students{
    private int id;
    private String name;
    private  double marks;
    public Students(int id, String name, double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public  int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getMarks(){
        return marks;
    }
    public  String toString(){
        return "Students [id= " + id + ", name= " + name + ", marks= " + marks + "]";
    }
}
class SortName implements Comparator<Students>{
    public  int compare(Students s1, Students s2){
        return s1.getName().compareTo(s2.getName());
    }
}

class SortMarks implements Comparator<Students>{
    public int compare(Students s1, Students s2){
        return Double.compare(s1.getMarks(), s2.getMarks());
    }
}