package _12_Java_Collection_Frameword.EXC_1_ArrayList_LinkedList_in_Java_Collection_FrameWord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        // Sử dụng ArrayList
        // productList = new ArrayList<>();

        // Sử dụng LinkedList
        productList = new LinkedList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Sản phẩm đã được thêm vào danh sách.");
    }

    public void updateProduct(int id, String newName, double newPrice) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.name = newName;
                product.price = newPrice;
                System.out.println("Thông tin sản phẩm đã được cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với ID " + id + ".");
    }

    public void deleteProduct(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                System.out.println("Sản phẩm đã được xoá khỏi danh sách.");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với ID " + id + ".");
    }

    public void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            System.out.println("Danh sách sản phẩm:");
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    public void searchProduct(String name) {
        List<Product> searchResults = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                searchResults.add(product);
            }
        }
        if (searchResults.isEmpty()) {
            System.out.println("Không tìm thấy sản phẩm với tên \"" + name + "\".");
        } else {
            System.out.println("Kết quả tìm kiếm:");
            for (Product product : searchResults) {
                System.out.println(product);
            }
        }
    }

    public void sortProductsAscending() {
        Collections.sort(productList, Comparator.comparing(Product::getPrice));
        System.out.println("Danh sách sản phẩm đã được sắp xếp tăng dần theo giá.");
    }

    public void sortProductsDescending() {
        Collections.sort(productList, Comparator.comparing(Product::getPrice).reversed());
        System.out.println("Danh sách sản phẩm đã được sắp xếp giảm dần theo giá.");
    }
}
