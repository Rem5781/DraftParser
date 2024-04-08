package Danila;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
                Document document  = Jsoup.connect("https://www.google.com/search?q=%D0%BA%D1%83%D1%80%D1%81+%D0%B4%D0%BE%D0%BB%D0%BB%D0%B0%D1%80%D0%B0&newwindow=1&sca_esv=e11a3816d0bf0ea3&sxsrf=ACQVn09DW1CXuFlfgQPYKRZjJwzP-OE_GQ%3A1712598836720&ei=NC8UZtfLK4G_wPAP-7OF2Ao&ved=0ahUKEwjXtbjql7OFAxWBHxAIHftZAasQ4dUDCBA&oq=rehc+ljkkfhf&gs_lp=Egxnd3Mtd2l6LXNlcnAiDHJlaGMgbGpra2ZoZkgAUABYAHAAeAGQAQCYAQCgAQCqAQC4AQzIAQCYAgCgAgCYAwDiAwUSATEgQJIHAKAHAA&sclient=gws-wiz-serp").userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64; rv:45.0) Gecko/20100101 Firefox/45.0")
                        .referrer("https://www.google.com/search?q=%D0%BA%D1%83%D1%80%D1%81+%D0%B4%D0%BE%D0%BB%D0%BB%D0%B0%D1%80%D0%B0&newwindow=1&sca_esv=e11a3816d0bf0ea3&sxsrf=ACQVn09DW1CXuFlfgQPYKRZjJwzP-OE_GQ%3A1712598836720&ei=NC8UZtfLK4G_wPAP-7OF2Ao&ved=0ahUKEwjXtbjql7OFAxWBHxAIHftZAasQ4dUDCBA&oq=rehc+ljkkfhf&gs_lp=Egxnd3Mtd2l6LXNlcnAiDHJlaGMgbGpra2ZoZkgAUABYAHAAeAGQAQCYAQCgAQCqAQC4AQzIAQCYAgCgAgCYAwDiAwUSATEgQJIHAKAHAA&sclient=gws-wiz-serp")
                        .get();
                //document.selectFirst()
            Elements title = document.select("title");
            System.out.println(title);

            Elements usd = document.select("span");
            System.out.println(usd);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}