package _17_IO_Binary_File_and_Serialization.EXC_1_Quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }

    // Thêm sản phẩm vào danh sách
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Hiển thị danh sách sản phẩm
    public void displayProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    // Tìm kiếm sản phẩm theo mã
    public Product findProductByCode(String code) {
        for (Product product : productList) {
            if (product.getCode().equals(code)) {
                return product;
            }
        }
        return null;
    }

    // Ghi danh sách sản phẩm vào file nhị phân
    public void saveToFile(String filename) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(filename))) {
            outputStream.writeInt(productList.size());
            for (Product product : productList) {
                outputStream.writeUTF(product.getCode());
                outputStream.writeUTF(product.getName());
                outputStream.writeDouble(product.getPrice());
                outputStream.writeUTF(product.getManufacturer());
                outputStream.writeUTF(product.getDescription());
            }
            System.out.println("Đã lưu danh sách sản phẩm vào file " + filename);
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    // Đọc danh sách sản phẩm từ file nhị phân
    public void loadFromFile(String filename) {
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(filename))) {
            int size = inputStream.readInt();
            for (int i = 0; i < size; i++) {
                String code = inputStream.readUTF();
                String name = inputStream.readUTF();
                double price = inputStream.readDouble();
                String manufacturer = inputStream.readUTF();
                String description = inputStream.readUTF();

                Product product = new Product(code, name, price, manufacturer, description);
                productList.add(product);
            }
            System.out.println("Đã đọc danh sách sản phẩm từ file " + filename);
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}