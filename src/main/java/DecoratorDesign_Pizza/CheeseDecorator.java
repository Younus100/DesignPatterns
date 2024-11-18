package DecoratorDesign_Pizza;

public class CheeseDecorator extends PizzaDecorator{
    CheeseDecorator(Pizza pizza) {
        super(pizza, 5);
    }

    @Override
    String getDescription() {
        return null;
    }

    @Override
    double getPrice() {
        return price + pizza.getPrice();
    }
}
