package CommandDesignPattern;

public class OnCommand implements Command{
    @Override
    public void execute(Light light) {
        light.isOn = true;
    }
}
