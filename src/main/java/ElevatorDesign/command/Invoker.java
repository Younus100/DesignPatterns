package ElevatorDesign.command;

import ElevatorDesign.ElevatorCar;

public class Invoker {
    ICommand iCommand;
    public Invoker(ICommand iCommand, ElevatorCar elevatorCar) {
        this.iCommand = iCommand;
    }

    void executeCommand(){
        iCommand.execute();
    }

}
