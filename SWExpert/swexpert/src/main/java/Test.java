import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        String a="";
        for (String s : stack) {
            a+=s;
        }
        System.out.println("a = " + a);
    }
}