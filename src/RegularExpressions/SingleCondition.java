package RegularExpressions;

public class SingleCondition {
    public static void main(String[] args) {
        String regex = "^[A-Za-z][A-Za-z0-9]* [A-Za-z0-9]+$";
        String[] input = {
                "Hello World",
                "Java 8",
                "User1 Name",
                "Suraj Kumar",
                "A B",
                "Test Case",
                "Hello",
                "Java8",
                "123",
                "HelloWorld",
                " Hello World",
                "Hello  World"
        };

        for(String s : input){
            System.out.println(s+" -> "+s.matches(regex));
        }
    }
}
