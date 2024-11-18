package DecoratorDesign_Pizza;

public class WheatMediumBasePizza extends BasePizza{

    WheatMediumBasePizza() {
        super(10);
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
