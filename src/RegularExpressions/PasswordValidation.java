package RegularExpressions;

/*  Minimum 8 characters
	Must contain at least one uppercase letter
	Must contain at least one digit
 */
public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println("Chintu22".matches("^(?=.*[A-Z])(?=.*\\d).{8,}"));
    }
}
