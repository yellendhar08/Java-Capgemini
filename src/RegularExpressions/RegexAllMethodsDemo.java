package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAllMethodsDemo {
    public static void main(String[] args) {

        String text = "Java 123 and 456 released on 12-05-2024";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text);

        while (m.find()){
            System.out.println(m.group());
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println("-----");
        }



    }
}


//Pattern pattern = Pattern.compile("(\\d+)");
//Matcher matcher = pattern.matcher(text);
//
//        while (matcher.find()) {
//        System.out.println(matcher.group());
//        System.out.println(matcher.start());
//        System.out.println(matcher.end());
//        System.out.println("-----");
//        }