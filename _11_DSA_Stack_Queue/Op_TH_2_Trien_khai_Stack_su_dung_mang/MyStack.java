package _11_DSA_Stack_Queue.Op_TH_2_Trien_khai_Stack_su_dung_mang;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    public int size() {
        return index;
    }


    boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    private boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
}
