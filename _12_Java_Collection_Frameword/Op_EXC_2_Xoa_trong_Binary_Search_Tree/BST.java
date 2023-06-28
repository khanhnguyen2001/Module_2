package _12_Java_Collection_Frameword.Op_EXC_2_Xoa_trong_Binary_Search_Tree;

class BST {
    Node root;

    BST() {
        root = null;
    }

    boolean delete(int key) {
        // Tìm phần tử cần xoá và nút cha của nó
        Node current = root;
        Node parent = null;
        boolean isLeftChild = false;

        while (current != null && current.data != key) {
            parent = current;

            if (key < current.data) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
        }

        // Nếu phần tử không được tìm thấy, trả về false
        if (current == null)
            return false;

        // Xử lý trường hợp 1: Nút hiện tại không có nút con trái
        if (current.left == null) {
            if (current == root)
                root = current.right;
            else if (isLeftChild)
                parent.left = current.right;
            else
                parent.right = current.right;
        }
        // Xử lý trường hợp 2: Nút hiện tại có nút con trái
        else {
            // Tìm nút chứa phần tử lớn nhất trong cây con trái của nút hiện tại
            Node rightMost = current.left;
            Node parentOfRightMost = current;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }

            // Sao chép giá trị phần tử từ nút rightMost vào nút hiện tại
            current.data = rightMost.data;

            // Kết nối nút cha của rightMost với nút con trái của rightMost
            if (parentOfRightMost == current)
                parentOfRightMost.left = rightMost.left;
            else
                parentOfRightMost.right = rightMost.left;
        }

        return true;
    }

    public void insert(int i) {
    }

    public void inOrderTraversal() {
    }
}
