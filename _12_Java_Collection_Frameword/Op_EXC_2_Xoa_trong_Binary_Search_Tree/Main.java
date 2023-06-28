package _12_Java_Collection_Frameword.Op_EXC_2_Xoa_trong_Binary_Search_Tree;

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

        // Xoá phần tử 32
        bst.delete(32);

        // In BST sau khi xoá phần tử
        bst.inOrderTraversal();
    }
}
