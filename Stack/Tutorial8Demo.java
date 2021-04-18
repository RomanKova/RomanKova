
import java.util.Scanner;

public class Tutorial8Demo {

    public static void main(String[] args) {
        System.out.print("Enter an infix expression : ");
        Scanner scanner = new Scanner(System.in);
        String expr = scanner.nextLine();
        String postFixExpr = infixToPostFix(expr);
        int result = evaluatePostfix(postFixExpr);
        System.out.println("The expression evaluates to : " + result);

    }

    private static int evaluatePostfix(String exp) {
        StackUsingArray<Integer> stack = new StackUsingArray<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isDigit(c))
                stack.push(c - '0');
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;

                    case '-':
                        stack.push(val2 - val1);
                        break;

                    case '/':
                        stack.push(val2 / val1);
                        break;

                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return stack.pop();

    }

    private static String infixToPostFix(String expr) {
        String result = new String("");
        StackUsingArray<Character> stack = new StackUsingArray<>();
        for (int i = 0; i < expr.length(); ++i) {
            char c = expr.charAt(i);
            if (Character.isLetterOrDigit(c))
                result += c;
            else if (c == '(')
                stack.push(c);
            else if (c == ')') {
                while (!stack.isEmpty() &&
                        stack.peek() != '(')
                    result += stack.pop();
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c)
                        <= precedence(stack.peek())) {

                    result += stack.pop();
                }
                stack.push(c);
            }

        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Expression not valid";
            result += stack.pop();
        }
        return result;
    }

    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    private static void testLinkedListBasedStack() {
        StackUsingArray<Integer> s1 = new StackUsingArray<>();

        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        s1.push(40);
        System.out.println(s1.pop());
        System.out.println(s1.pop());

        StackUsingArray<String> s2 = new StackUsingArray<>();

        s2.push("Ten");
        s2.push("Twenty");
        s2.push("Thirty");
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        s2.push("Forty");
        System.out.println(s2.pop());
        System.out.println(s2.pop());
    }

    private static void testArrayBasedStack() {
        StackUsingLinkedList<Integer> s1 = new StackUsingLinkedList<>();

        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        s1.push(40);
        System.out.println(s1.pop());
        System.out.println(s1.pop());

        StackUsingLinkedList<String> s2 = new StackUsingLinkedList<>();

        s2.push("Ten");
        s2.push("Twenty");
        s2.push("Thirty");
        System.out.println(s2.pop());
        System.out.println(s2.pop());
        s2.push("Forty");
        System.out.println(s2.pop());
        System.out.println(s2.pop());
    }
}
