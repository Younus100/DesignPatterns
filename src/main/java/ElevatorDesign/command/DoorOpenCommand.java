package ElevatorDesign.command;

import ElevatorDesign.ElevatorCar;
import ElevatorDesign.command.ICommand;

public class DoorOpenCommand implements ICommand {
    ElevatorCar elevatorCar;

    public DoorOpenCommand(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    @Override
    public void execute() {
        elevatorCar.openDoor();
    }
}
