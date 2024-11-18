package CommandDesignPattern;

public class OffCommand implements Command{
    @Override
    public void execute(Light light) {
        light.isOn = false;
    }
}
