package AuctionManagement;

import java.util.List;

public class Mediator { //can be named as Auction Manager
    List<User> users;
    User owner;
    BiddingInfo biddingInfo;
    Product product;

    void placeBid(User user,int price){
        biddingInfo.acceptBid(user,price);
        for(User u:users){
            u.receiveNotificaiton("Bid place by"+u.toString()+"  :"+price);
        }
    }

    void addBider(User user){
        users.add(user);
    }

    void removeBider(User user){
        users.remove(user);
    }

    void cancelBid(BiddingInfo biddingInfo,User user){
        biddingInfo.cancelBider(user);
    }

    void closeBidding(){
        Bid bid = biddingInfo.bids.getFirst();
        for(User u:users){
            u.receiveNotificaiton("Bid winner "+bid.user.toString()+"  :"+bid.price +" Now bid is close " +
                    "Congration to all the participant");
        }
        biddingInfo.bidwinner(bid.user,bid.price,product);
    }
}
