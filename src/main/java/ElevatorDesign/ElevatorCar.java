package ElevatorDesign;

import java.util.ArrayList;
import java.util.List;

public abstract class ElevatorCar {
    protected int capacity;
    protected int currentFloor = 0;
    protected boolean isOccupied = false;
    protected List<Integer> destinations = new ArrayList<>();
    protected ClarState state = ClarState.IDLE;
    protected Door door;

    public void openDoor() {
        door.open();
    }

    public void closeDoor() {
        door.close();
    }

    public void setCurrentFloor(int floor) {
        this.currentFloor = floor;
    }

    public void destinations(int floor){
        this.destinations.add(floor);
    }
}
