package immutablebuilder;

public class Client {
    public  static void main(String arg[]){
        Person p1 =  Person.builder().name(2).id(2).build();
        Person p2 = new Person.Builder().name(3).id(5).build();
        //Advantage of Builder Pattern
        //u can create immutable class. do not add setter and make  constructor Private in Person
        //Advantage: -Readability, Immutability and Encapculation
        //Single Responsibility, Open Close,

        //This Design Pattern contain Builder, ConcreteBuilder(real object), Director, Client
    }
}
