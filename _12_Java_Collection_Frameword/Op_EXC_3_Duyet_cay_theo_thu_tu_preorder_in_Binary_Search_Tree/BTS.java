package _12_Java_Collection_Frameword.Op_EXC_3_Duyet_cay_theo_thu_tu_preorder_in_Binary_Search_Tree;

class BST {
    Node root;

    BST() {
        root = null;
    }

    // Hàm gọi đệ qui để duyệt theo thứ tự pre-order
    void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    // Wrapper function để duyệt theo thứ tự pre-order
    void preOrderTraversal() {
        preOrderTraversal(root);
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
