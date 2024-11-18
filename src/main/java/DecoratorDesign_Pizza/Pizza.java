package DecoratorDesign_Pizza;

public abstract class Pizza {
    String description;
    double price;
    Pizza(double price){
        this.price = price;
    }

    abstract String getDescription();
    abstract double getPrice();
}
