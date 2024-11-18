//import java.util.List;
//
//public class InventoryManagementSystem {
//
//}
//
//class Seller{
//    int id;
//    List<wendingMachinDersign.Product> products;
//    List<PaymnetModes> paymnetModes;
//    Address address;
//    List<String> pincodes;
//}
//
//class Address {
//    int pincode;
//}
//
//enum PaymnetModes{
//    UPI, CASH_ON_DELIVERY, CREDIT, DEBIT,
//}
//
//class Product{
//    int id;
//    List<ProductUnit> productUnits;
//    String name;
//    String desc;
//}
//
//class ProductUnit{
//    Seller seller;
//    int count;
//}
//
//class User{
//    Cart cart;
//}
//
//class Cart {
//    List<wendingMachinDersign.Product> productsInCart;
//}
//
//class POrder{
//    User user;
//    Seller seller;
//    List<wendingMachinDersign.Product> products;
//    Address deliveryAddress;
//    String deliveryPincode;
//    PaymnetModes paymnetMode;
//}
//
//class OrderController{
//    POrder creteOrder(String destinationpincode, int sellerId, int userId){
//
//        return null;
//    }
//
//}
//
//class InventoryController{
//    Seller createSeller(){
//        return null;
//    }
//    List<Seller> getSellers(SearchSellerStretegy searchSellerStretegy){
//        return null;
//    }
//
//}
//
//class ProductController{
//    wendingMachinDersign.Product createProduct(){
//        return null;
//    }
//    ProductUnit creteProductUnit(wendingMachinDersign.Product product){
//        return null;
//    }
//
//}
//
//class InventoryManager{
//    OrderController orderController;
//    SearchSellerStretegy searchSellerStretegy;
//
//    void SetSellerStretegy(SearchSellerStretegy searchSellerStretegy){
//        this.searchSellerStretegy = searchSellerStretegy;
//    }
//
//}
//
//abstract class SearchSellerStretegy{
//
//}
//
//
//
//
