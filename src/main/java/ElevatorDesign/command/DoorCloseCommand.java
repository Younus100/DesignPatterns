package ElevatorDesign.command;

import ElevatorDesign.ElevatorCar;

public class DoorCloseCommand implements ICommand {
    ElevatorCar elevatorCar;

    public DoorCloseCommand(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    @Override
    public void execute() {
        elevatorCar.closeDoor();
    }
}
