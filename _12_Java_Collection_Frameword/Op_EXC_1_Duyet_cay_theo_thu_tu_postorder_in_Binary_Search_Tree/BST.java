package _12_Java_Collection_Frameword.Op_EXC_1_Duyet_cay_theo_thu_tu_postorder_in_Binary_Search_Tree;

// Lớp chứa phương thức để thực hiện duyệt theo thứ tự post order trong BST
class BST {
    Node root;

    BST() {
        root = null;
    }

    // Phương thức đệ qui để duyệt các cây con bên trái
    void postOrderTraversal(Node node) {
        if (node == null)
            return;

        // Duyệt cây con bên trái
        postOrderTraversal(node.left);

        // Duyệt cây con bên phải
        postOrderTraversal(node.right);

        // In giá trị của nút gốc
        System.out.print(node.data + " ");
    }

    // Phương thức bổ trợ để bắt đầu duyệt theo thứ tự post order
    void postOrderTraversal() {
        postOrderTraversal(root);
    }

    // Phương thức thêm một nút vào BST
    void insert(int data) {
        root = insertRec(root, data);
    }

    // Phương thức đệ qui để thêm một nút vào BST
    Node insertRec(Node root, int data) {
        // Nếu BST rỗng, tạo một nút mới
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Nếu giá trị cần chèn nhỏ hơn giá trị của nút gốc, thêm vào cây con bên trái
        if (data < root.data)
            root.left = insertRec(root.left, data);

            // Nếu giá trị cần chèn lớn hơn hoặc bằng giá trị của nút gốc, thêm vào cây con bên phải
        else if (data >= root.data)
            root.right = insertRec(root.right, data);

        // Trả về con trỏ root sau khi thêm nút
        return root;
    }
}
