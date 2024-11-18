package AuctionManagement;

public class Product {
    BiddingInfo biddingInfo;

    boolean isActiveforBidding(){
        return biddingInfo.isActive;
    }
}
