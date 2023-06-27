package _11_DSA_Stack_Queue.Op_EXC_1_Chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Stack;

public class DecimalToBinary {
    public static String decimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        StringBuilder binary = new StringBuilder();

        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 30;
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binaryNumber);
    }
}

