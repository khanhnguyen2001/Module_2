package _16_IO_Text_File.EXC_2_Doc_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderExample {
    public static void main(String[] args) {
        String csvFilePath = "C:\\CodeGym\\BaiTap\\Module_2\\src\\Text\\countries.csv"; // Đường dẫn của tệp CSV

        try {
            List<Country> countries = new ArrayList<>();

            BufferedReader br = new BufferedReader(new FileReader(csvFilePath));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length >= 3) {
                    int id = Integer.parseInt(data[0].trim());
                    String code = data[1].trim();
                    String name = data[2].trim();

                    Country country = new Country(id, code, name);
                    countries.add(country);
                }
            }

            br.close();

            // Hiển thị danh sách các quốc gia
            for (Country country : countries) {
                System.out.println(country);
            }
        } catch (IOException e) {
            System.err.println("Đã xảy ra lỗi trong quá trình đọc tệp CSV.");
            e.printStackTrace();
        }
    }
}

class Country {
    private int id;
    private String code;
    private String name;

    public Country(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

