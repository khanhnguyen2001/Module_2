package _11_DSA_Stack_Queue.TH_1_Trien_khai_stack_su_dung_LinkedList_trong_thu_vien_java_util;

public class GenericStackClient {
    private static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.print("1.2 Pop elements from stack:");
        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operations: " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after push operations: " + stack.size());
        System.out.print("2.2 Pop elements from stack:");
        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop());
        }
        System.out.println("\n2.3 Size of stack after pop operations: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of strings");
        stackOfStrings();
        System.out.println("\n2. Stack of integers");
        stackOfIntegers();
    }
}
