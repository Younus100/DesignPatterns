package DecoratorDesign_Pizza;

public class WheatBasePizza extends BasePizza{

    WheatBasePizza() {
        super(20);
    }

    @Override
    String getDescription() {
        return null;
    }

    @Override
    double getPrice() {
        return price;
    }


}
