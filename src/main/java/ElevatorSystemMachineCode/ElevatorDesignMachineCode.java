package ElevatorSystemMachineCode;


import java.util.List;

public class ElevatorDesignMachineCode {
    class Solution{
        LiftManager liftManager;
        void init(int floor,int lift){
            liftManager.setTotalFloorLift(floor,lift);
        }
        int requestLift(int startFloor, int destinationFloor){
            int liftNo = 0;

            return liftNo;
        }

        void tick(){
            liftManager.updateAll();
        } // thismethod will run every 1 second
    }
}
class Car{
    int currentFloor = 0;
    CarState carState = new IdleState();

    void setCarState(CarState carState){
        this.carState = carState;
    }
    CarState getCarstate(){ return carState;}

    List<int[]> destinationFloors;

    void update(){
        if(carState instanceof UpState){
            currentFloor++;
        } else if(carState instanceof DownState){
            currentFloor--;
        }
        //more complex code to write
    }
}

abstract class Button{

}

class FloorButton extends Button {

}

abstract class CarState{
    public abstract void updateFloor();
}

class UpState extends CarState{

    @Override
    public void updateFloor() {

    }
}

class DownState extends CarState{

    @Override
    public void updateFloor() {

    }
}

class IdleState extends CarState{

    @Override
    public void updateFloor() {

    }
}

class LiftManager{
    int totalFloor;
    int totalLift;
    List<Car> cars;

    void setTotalFloorLift(int totalFloor,int totalLift){
        this.totalFloor = totalFloor;
        this.totalLift = totalLift;
    }

    void updateAll(){
        for(Car car:cars){
            car.update();
        }
    }

}
