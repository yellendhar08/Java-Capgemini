package Strings;

public class ProgrammesOnStrings {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Java";
        String s4 = new String("Java is good");


        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        s2=s2.toUpperCase();
        System.out.println(s2);
        System.out.println(s4.startsWith(s3));
        System.out.println(s2.charAt(2));

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.substring(1,3));

        System.out.println(s1.replace('a','A'));

        String s5 = " Java ";
        System.out.println(s5.length());
        System.out.println(s5.trim().length());

        System.out.println(s1.indexOf('a'));




    }
}
