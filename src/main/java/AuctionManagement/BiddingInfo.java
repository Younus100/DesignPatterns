package AuctionManagement;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.TreeMap;
import java.util.TreeSet;

public class BiddingInfo {
    WinnerHandler winnerHandler;
    boolean isActive;
    LocalDateTime startTime;
    LocalDateTime endTime;
    TreeSet<Bid> bids;
    void acceptBid(User user,double price){
        bids.add(new Bid(user,price));
    }

    void removeBider(User user){
        bids.remove(user);
    }

    void cancelBider(User user){
        bids.remove(user);
    }
    void bidwinner(User user,double price,Product product){
        winnerHandler.onBidWin(user, product, price);
    }
}
