package ElevatorDesign.command;

import ElevatorDesign.ElevatorCar;
import ElevatorDesign.command.ICommand;

public class SetDestinationFoorCommand implements ICommand {
    ElevatorCar elevatorCar;

    int floor;
    public SetDestinationFoorCommand(ElevatorCar elevatorCar,int floor) {
        this.elevatorCar = elevatorCar;
    }

    @Override
    public void execute() {
        elevatorCar.destinations(this.floor);
    }
}
