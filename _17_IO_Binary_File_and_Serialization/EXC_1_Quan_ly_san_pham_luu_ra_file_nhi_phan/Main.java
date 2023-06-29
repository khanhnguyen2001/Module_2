package _17_IO_Binary_File_and_Serialization.EXC_1_Quan_ly_san_pham_luu_ra_file_nhi_phan;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        // Thêm sản phẩm
        Product product1 = new Product("P001", "Product 1", 9.99, "Manufacturer 1", "Description 1");
        Product product2 = new Product("P002", "Product 2", 19.99, "Manufacturer 2", "Description 2");
        Product product3 = new Product("P003", "Product 3", 29.99, "Manufacturer 3", "Description 3");

        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);

        // Hiển thị danh sách sản phẩm
        productManager.displayProducts();

        // Ghi danh sách sản phẩm vào file
        productManager.saveToFile("products.bin");

        // Xóa danh sách sản phẩm trong bộ nhớ
        productManager = new ProductManager();

        // Đọc danh sách sản phẩm từ file
        productManager.loadFromFile("products.bin");

        // Hiển thị danh sách sản phẩm đã đọc
        productManager.displayProducts();

        // Tìm kiếm sản phẩm theo mã
        String searchCode = "P002";
        Product foundProduct = productManager.findProductByCode(searchCode);
        if (foundProduct != null) {
            System.out.println("Tìm thấy sản phẩm có mã " + searchCode + ":");
            System.out.println(foundProduct);
        } else {
            System.out.println("Không tìm thấy sản phẩm có mã " + searchCode);
        }
    }
}
