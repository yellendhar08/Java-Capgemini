package RegularExpressions;

public class MobileNumberValidate {
    public static void main(String[] args){
        System.out.println("regular expression to validate a mobile number: ");
        System.out.println("9855845721".matches("^[6-9]\\d{9}"));
    }
}
