public class BuyElectronics {
    public static void main(String[] args) throws Exception {
        System.out.println("XBOX:");
        System.out.println("GameStop: " + Xbox.XboxGameStopInStock());
        System.out.println("Best Buy: " + Xbox.XboxBestBuyInStock());
        System.out.println("PS5:");
        System.out.println("GameStop: " + PS5.PS5GameStopInStock());
        System.out.println("Best Buy: " + PS5.PS5BestBuyInStock());
    }
}