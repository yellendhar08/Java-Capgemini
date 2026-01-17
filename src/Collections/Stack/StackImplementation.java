package Collections.Stack;

import java.util.Stack;
public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(12);
        st.push(14);
        st.push(16);
        st.push(18);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
