package CommandDesignPattern;

public class Remote {
    Command command;
    void setCommand(Command command){
        this.command=command;
    }
    void OnPressed(Light light){
        command.execute(light);
    }

    void OffPressed(Light light){
        command.execute(light);
    }
}
