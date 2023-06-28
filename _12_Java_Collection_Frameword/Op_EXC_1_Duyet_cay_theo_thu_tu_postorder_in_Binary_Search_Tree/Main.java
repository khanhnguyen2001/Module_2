package _12_Java_Collection_Frameword.Op_EXC_1_Duyet_cay_theo_thu_tu_postorder_in_Binary_Search_Tree;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        // Thêm các phần tử vào BST
        bst.insert(27);
        bst.insert(35);
        bst.insert(32);
        bst.insert(42);
        bst.insert(14);
        bst.insert(10);
        bst.insert(19);

        // Duyệt theo thứ tự post order và in ra các phần tử
        System.out.println("Thứ tự post order của BST là: ");
        bst.postOrderTraversal();
    }
}
