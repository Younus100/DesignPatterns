package DecoratorDesign_Pizza;

public class Client {

     public  static void main(String args[]){
         Pizza pizza = new WheatBasePizza();
         Pizza pizza1 = new CheeseDecorator(pizza);
         double p = pizza1.getPrice();
         System.out.println("Price: "+p);
     }
}
