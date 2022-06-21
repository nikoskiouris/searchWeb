import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class PS5 {
    public static String PS5GameStopInStock() throws IOException {
        String url = "https://www.gamestop.com/consoles-hardware/playstation-5/consoles/products/playstation-5/229025.html";
        Document document = Jsoup.connect(url).get();
        String productStatus = document.select(".product-details-container .top-divider.unavailable-container.font-bold.product-unavailable-redesign").text();
        return productStatus;
    }

    public static String PS5BestBuyInStock() throws IOException {
        String url = "https://www.bestbuy.com/site/sony-playstation-5-console/6426149.p?skuId=6426149";
        Document document = Jsoup.connect(url).get();
        String productStatus = document.select(".col-xs-12 .add-to-cart-button.c-button-block.c-button-lg.c-button-disabled.c-button").text();
        return productStatus;
    }
}
