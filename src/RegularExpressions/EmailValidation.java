package RegularExpressions;
/*Username part can contain:
	letters (a–z, A–Z)
	digits (0–9)
	special characters: . _ % + -
	Must contain @
	Domain name should contain only letters
	Extension should contain at least 2 letters
*/


public class EmailValidation {
    public static void main(String[] args) {
        System.out.println("yellendhar225@com".matches("^[a-zA-Z0-9._%+-]+@[a-zA-z]+.[a-zA-Z]+{2,}$"));
    }
}
