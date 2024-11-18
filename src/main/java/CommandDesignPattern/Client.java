package CommandDesignPattern;

public class Client {
    public static void main(String arg[]){
        Light light = new Light();
        Remote remote = new Remote();
        remote.setCommand(new OnCommand());
        remote.OnPressed(light);
        System.out.println(light.isOn);
        remote.setCommand(new OffCommand());
        remote.OnPressed(light);
        System.out.println(light.isOn);
    }
}
