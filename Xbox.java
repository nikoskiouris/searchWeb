import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Xbox {
    public static String XboxGameStopInStock() throws IOException {
        String url = "https://www.gamestop.com/consoles-hardware/xbox-series-x%7Cs/consoles/products/microsoft-xbox-series-x/224744.html";
        Document document = Jsoup.connect(url).get();
        String productStatus = document.select(".main-product-section.row .top-divider.unavailable-container.font-bold.product-unavailable-redesign").text();
        return productStatus;
    }

    public static String XboxBestBuyInStock() throws IOException {
        String url = "https://www.bestbuy.com/site/microsoft-xbox-series-x-1tb-console-black/6428324.p?skuId=6428324";
        Document document = Jsoup.connect(url).get();
        String productStatus = document.select(".add-to-cart-button.c-button-block.c-button-lg.c-button-disabled.c-button").text();
        return productStatus;
    }
}