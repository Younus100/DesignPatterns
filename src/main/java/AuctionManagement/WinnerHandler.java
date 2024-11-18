package AuctionManagement;

public class WinnerHandler {
    void onBidWin(User user,Product product,double price){
        user.accepProduct(product, price);
    }
}
