package RegularExpressions;

public class RegularExpression {
    public static void main(String[] args) {
        System.out.println("Suraj".matches("S...j")); //Any single character
        System.out.println("Suraj".matches("Su..j"));
        System.out.println("Suaj".matches("S...j"));
        System.out.println("Sairaj".matches("S...j"));
        System.out.println("S123j".matches("S...j"));

        System.out.println();
        System.out.println("Suraj".matches("S+"));   //1 or more of previous
        System.out.println("SSraj".matches("S+raj"));
        System.out.println("Sxxj".matches("S+j"));
        System.out.println("SSj".matches("S+j"));
        System.out.println("SSJ".matches("S+j"));

        System.out.println();
        System.out.println("j".matches("S*j")); //0 or more of previous
        System.out.println("Sj".matches("S*j"));
        System.out.println("SSj".matches("S*j"));
        System.out.println("Sabcj".matches("S*j"));
        System.out.println("jj".matches("S*j"));

        System.out.println();
        System.out.println("colr".matches("colo?r"));  //o? allows only 0 or 1 o
        System.out.println("color".matches("colo?r"));
        System.out.println("coloor".matches("colo?r"));
        System.out.println("abc".matches("ab(c)?"));
        System.out.println("ab".matches("ab(c)?"));
        System.out.println("abcd".matches("ab(c)?"));


        System.out.println();
        System.out.println("Aditya".matches("A*d+i*t+y+a+"));
        System.out.println("AAAdddiityaa".matches("A*d+i*t+y+a+"));
        System.out.println("Additttyya".matches("A*d+i*t+y+a+"));
        System.out.println("dityaaa".matches("A*d+i*t+y+a+"));
        System.out.println("Adtttyya".matches("A*d+i*t+y+a+"));
        System.out.println("Adtttyya".matches(".*"));

        System.out.println();
        System.out.println("Suraj".matches(".*"));
        System.out.println("SURAJ".matches(".*"));
        System.out.println("suraj".matches(".*"));
        System.out.println("SuRaJ".matches(".*"));
        System.out.println("Suurajj".matches(".*"));
        System.out.println("Suraj@123".matches(".*"));
        System.out.println("s#u@j@123".matches(".*"));
        System.out.println("123Suraj".matches(".*"));
        System.out.println("12345".matches(".*"));

        System.out.println();
        System.out.println("5".matches("\\d")); //exactly one digit
        System.out.println("0".matches("\\d"));
        System.out.println("9".matches("\\d"));
        System.out.println("12".matches("\\d"));
        System.out.println("a".matches("\\d"));
        System.out.println(" ".matches("\\d"));

        System.out.println();
        System.out.println("a".matches("\\w"));  //any word char a-z, A-Z, 0-9, underscore(_)
        System.out.println("Z".matches("\\w"));
        System.out.println("5".matches("\\w"));
        System.out.println("_".matches("\\w"));
        System.out.println("@".matches("\\w"));
        System.out.println(" ".matches("\\w"));

        System.out.println();
        System.out.println(" ".matches("\\s")); //any whitespace char
        System.out.println("\t".matches("\\s"));
        System.out.println("\n".matches("\\s"));
        System.out.println("a".matches("\\s"));
        System.out.println("1".matches("\\s"));


    }
}
