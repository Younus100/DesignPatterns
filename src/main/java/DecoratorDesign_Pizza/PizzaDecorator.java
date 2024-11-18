package DecoratorDesign_Pizza;

public abstract class PizzaDecorator extends BasePizza{
    Pizza pizza;
    PizzaDecorator(Pizza pizza, double price) {
        super(price);
        this.pizza = pizza;
    }
}
