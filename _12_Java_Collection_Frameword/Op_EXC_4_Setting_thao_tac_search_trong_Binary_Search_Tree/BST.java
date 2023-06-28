package _12_Java_Collection_Frameword.Op_EXC_4_Setting_thao_tac_search_trong_Binary_Search_Tree;

class BST {
    Node root;

    BST() {
        root = null;
    }

    // Hàm gọi đệ qui để tìm kiếm một phần tử trong BST
    boolean search(int key) {
        return searchRec(root, key);
    }

    // Hàm đệ qui để tìm kiếm một phần tử trong BST
    boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (key == root.data)
            return true;

        if (key < root.data)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

    // Hàm chèn một phần tử vào BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Hàm đệ qui để chèn một phần tử vào BST
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }
}