package _19_String_and_Regex.Op_EXC_1_Crawl_tin_tuc;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraper {
    public static void main(String[] args) {
        String url = "http://dantri.com.vn/the-gioi.htm";

        try {
            // Kết nối và lấy nội dung của trang web
            Document document = Jsoup.connect(url).get();

            // Lấy danh sách các bản tin từ trang web
            Elements newsElements = document.select(".news-item");

            // Hiển thị danh sách các bản tin
            for (Element element : newsElements) {
                String title = element.select(".news-item__title").text();
                String time = element.select(".news-item__date").text();
                System.out.println("Bản tin: " + title);
                System.out.println("Thời gian: " + time);
                System.out.println("------------------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


