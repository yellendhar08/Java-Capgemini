package Collections.Streams;

import java.util.*;
import java.util.stream.Collectors;
class Students{
    int id;
    String  name;
    double marks;
    public Students(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String toString(){
        return "Id: "+id+" Name: "+name+" Marks: "+marks;
    }
}
public class StreamsFunctions {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Printing elements using streams");
        num.stream().forEach(System.out::println);

        System.out.println("Print all the even numbers using streams");
        num.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("Printing all odd numbers with extra value of 3");
        num.stream().filter(n -> n % 2 != 0).map(n -> n + 3).forEach(System.out::println);

        System.out.println("Find even numbers and store in another list");
        List<Integer> new_evenList = num.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(new_evenList);

        List<String> names = List.of("Nitish", "Rohit", "Devansh", "Anuj", "Pawan", "Girish");
        System.out.println("Print all the names ending with sh");
        names.stream().filter(name -> name.endsWith("sh")).forEach(System.out::println);

        List<Students> studentsList = List.of(
                new Students(3, "Murali", 75.5),
                new Students(4, "Aditya", 85.5),
                new Students(1, "Vishnu", 80.5),
                new Students(2, "Pramod", 90.5)
        );

        System.out.println("Print all the students who got marks more than 80");
        studentsList.stream().filter(s -> s.marks > 80).forEach(System.out::println);

        System.out.println("Add 5 grace marks to each student");
        studentsList.stream().map(s -> s.marks + 5).forEach(System.out::println);

        System.out.println("Print students name sorted");
        studentsList.stream().sorted(Comparator.comparing(s -> s.name)).forEach(System.out::println);

        System.out.println("Print students accoriding to marks");
        studentsList.stream().sorted(Comparator.comparingDouble(s -> s.marks)).forEach(System.out::println);

        System.out.println("Print according to id");
        studentsList.stream().sorted(Comparator.comparingInt(s->s.id)).forEach(System.out::println);



    }
}
