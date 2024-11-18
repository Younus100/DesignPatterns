//package X_O_GAME;
//
//import java.util.List;
//
//public class ElevatorSystem {
//}
//class Car{
//    List<SelectFloorButton> selectFloorButtons;
//    CarState carState;
//    void initializeCar(int floor){
//        for(int i=1;i<=floor;i++){ selectFloorButtons.add(new SelectFloorButton(i)); }
//        this.carState = new IdleState();
//    }
//    void setCarState(CarState carState){
//        this.carState = carState;
//    }
//    CarState getCarstate(){ return carState;}
//
//    List<Floor> destinationFloors;
//}
//
//abstract class Button{
//
//}
//
//class UpButton extends Button{
//
//}
//
//class DownButton extends Button{
//
//}
//
//class SelectFloorButton extends Button{
//    int floorNo;
//    SelectFloorButton(int floorNo){
//        this.floorNo = floorNo;
//    }
//}
//
//abstract class CarState{
//
//}
//
//class UpState extends CarState{
//
//}
//
//class DownState extends CarState{
//
//}
//
//class IdleState extends CarState{
//
//}
//
//class Floor{
//    boolean isLast = false;
//    boolean isFirst = false;
//    int floorNo;
//    Floor(int floorNo){
//        this.floorNo = floorNo;
//    }
//}
//
//class ElevatorManager{
//    CarSchedulerStretegy carSchedulerStretegy;
//    ElevatorManager(CarSchedulerStretegy carSchedulerStretegy){
//        this.carSchedulerStretegy = carSchedulerStretegy;
//    }
//}
//
//abstract class CarSchedulerStretegy{
//    abstract void schedule(int destinationFloor,List<X_O_GAME.Car> cars);
//}
//
//class FIFOCarSchedularStretegy extends CarSchedulerStretegy{
//    @Override
//    void schedule(int destinationFloor,List<X_O_GAME.Car> cars) {
//        for()
//    }
//}
//
//class EnergyEfficientCarSchedularStretegy extends CarSchedulerStretegy{
//    @Override
//    void schedule(int destinationFloor,List<X_O_GAME.Car> cars) {
//
//    }
//}
//
