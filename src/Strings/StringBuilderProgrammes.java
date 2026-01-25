package Strings;

public class StringBuilderProgrammes {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ram");
        sb.append("Charan");
        System.out.println(sb.length());
        sb.insert(0,"Pinnaka");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.deleteCharAt(5);
        System.out.println(sb);
        sb.delete(3,6);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.isEmpty());
    }
}
