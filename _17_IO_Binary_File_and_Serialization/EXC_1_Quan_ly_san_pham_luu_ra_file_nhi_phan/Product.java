package _17_IO_Binary_File_and_Serialization.EXC_1_Quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.Serializable;

class Product implements Serializable {
    private String code;
    private String name;
    private double price;
    private String manufacturer;
    private String description;

    public Product(String code, String name, double price, String manufacturer, String description) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    // Các phương thức getter và setter

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
