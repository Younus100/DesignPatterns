package AuctionManagement;

public class Client {
    public static void main(String arg[]){
        User u1 = new User();
        u1.name = "user1";

        User u2 = new User();
        u2.name = "user2";

        User u3 = new User();
        u3.name = "user3";

        User owner = new User();
        owner.name = "owner";

        Product p = new Product();
        BiddingInfo biddingInfo = new BiddingInfo();
        p.biddingInfo = biddingInfo;

        owner.forBidding.add(p);





    }
}
