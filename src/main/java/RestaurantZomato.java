import java.util.ArrayList;
import java.util.List;

public class RestaurantZomato {

    class Solution{


    }

    class Restuarant{
        String name;
        String gstIn;
        Menu menu;
        Location location;
        Address address;
        double rating;
    }
    class Location {
        double longitute;
        double latitute;
    }
    class Address{
        String street;
        String city;
        String state;
        String country;
        int pincode;
    }

    class Menu {
        List<FoodItem> fooditemList = new ArrayList<>();
    }
    class FoodItem{
        String name;
        double price;
        double discount;
        List<AddOn> addOns = new ArrayList<>();
        FoodType foodType;
        double rating;
        List<FoodRating> ratings;
    }
    class AddOn{
        String name;
        double charge;
    }
    enum FoodType{
        CHINESE, JAIN, FASTFOOD, MUGHALAI;
    }

    class FoodRating{
        double rate;
        User user;
    }

    class User{
        Location location;
        Address address;
    }

    class RestaurantManager{
        List<Restuarant> restuarantByRating = new ArrayList<>();


    }

    class UserManager{
        void rateFood(Restuarant restuarant,FoodItem foodItem,double rating){

        }
    }
    interface SearchStretegy{

    }



}
