package AuctionManagement;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    public String  toString(){
        return  "User: "+name ;
    }
    List<AuctionManagement.Product> forBidding = new ArrayList<>();
    List<Product> purchaseProduct = new ArrayList<>();

    void receiveNotificaiton(String msg){
        System.out.println(msg);
    }

    void accepProduct(AuctionManagement.Product product,double price){

    }

}
