package factoryMethod;

public abstract class ShapeFactory {
    public static Shape getShape(String string){
        if(string.equals("SQURE")){  return new Square(); }
        else if(string.equals("CIRCLE")) { return new Circle(); }
        return new Rectangle();
    }

}
