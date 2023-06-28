package _12_Java_Collection_Frameword.Op_EXC_3_Duyet_cay_theo_thu_tu_preorder_in_Binary_Search_Tree;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        // Thêm các phần tử vào BST
        bst.insert(27);
        bst.insert(35);
        bst.insert(31);
        bst.insert(42);
        bst.insert(14);
        bst.insert(10);
        bst.insert(19);

        // Duyệt theo thứ tự pre-order và in kết quả
        System.out.println("Pre-order traversal:");
        bst.preOrderTraversal();
    }
}
