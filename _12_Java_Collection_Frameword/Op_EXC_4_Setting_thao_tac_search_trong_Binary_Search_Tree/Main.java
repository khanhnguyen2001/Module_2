package _12_Java_Collection_Frameword.Op_EXC_4_Setting_thao_tac_search_trong_Binary_Search_Tree;

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

        // Tìm kiếm phần tử 31
        boolean found = bst.search(31);
        System.out.println("Element 31 found: " + found);

        // Tìm kiếm phần tử 50
        found = bst.search(50);
        System.out.println("Element 50 found: " + found);
    }
}
