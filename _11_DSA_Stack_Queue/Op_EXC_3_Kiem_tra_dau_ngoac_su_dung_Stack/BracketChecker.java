package _11_DSA_Stack_Queue.Op_EXC_3_Kiem_tra_dau_ngoac_su_dung_Stack;

import java.util.Stack;

public class BracketChecker {
    public static boolean checkBrackets(String expression) {
        Stack<Character> bracketStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);

            if (symbol == '(' || symbol == '[' || symbol == '{') {
                bracketStack.push(symbol);
            } else if (symbol == ')' || symbol == ']' || symbol == '}') {
                if (bracketStack.isEmpty()) {
                    return false;
                }

                char left = bracketStack.pop();
                if ((left == '(' && symbol != ')') ||
                        (left == '[' && symbol != ']') ||
                        (left == '{' && symbol != '}')) {
                    return false;
                }
            }
        }

        return bracketStack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "s * (s - a) * (s - b) * (s - c)";
        String expression2 = "( - b + ( b ^ 2 - 4 * a * c ) ^ 0.5 ) / ( 2 * a )";
        String expression3 = "s * (s - a) * (s - b * (s - c)";
        String expression4 = "s * (s - a) * s - b) * (s - c)";
        String expression5 = "( - b + ( b ^ 2 - 4 * a * c ) ^ ( 0.5 / 2 * a ) )";

        System.out.println(checkBrackets(expression1)); // true
        System.out.println(checkBrackets(expression2)); // true
        System.out.println(checkBrackets(expression3)); // false
        System.out.println(checkBrackets(expression4)); // false
        System.out.println(checkBrackets(expression5)); // false
    }
}

