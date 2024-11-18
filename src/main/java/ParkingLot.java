import java.util.Arrays;
import java.util.HashMap;


public class ParkingLot {
    class Solution{
        Helper helper;
        PakingManager pakingManager;
        void init(Helper helper, String [][][] parking){
            pakingManager = new PakingManager(new NearrestParingSpot());
            pakingManager.initializeparkingSystem(parking);
        }
        String park(int vehicleType, String vehicleNumber, String ticketId){
            String  s;
            try {
                s = pakingManager.park(vehicleType,vehicleNumber,ticketId);
            } catch (Exception e) {
                return "";
            }
            return s;
        }

        int removeVehicle(String spotId, String vehicleNumber, String ticketId) {
            int i = removeVehicle (spotId, vehicleNumber, ticketId);
            return i;
        }
        ParkingResult searchVehicle( String spotId, String vehicleNumber, String ticketId){
            ParkingResult parkingResult;
            if(!spotId.equals("")){ parkingResult = pakingManager.searchBySpotId(spotId); }
            else if(!vehicleNumber.equals("")){ parkingResult = pakingManager.searchByVehicle(vehicleNumber); }
            else if(!ticketId.equals("")){ parkingResult = pakingManager.searchByTicket(ticketId); }
            return null;
        }
        int getFreeSpotsCount(int floor, int vehicleType){
            return 0;
        }

    }

    class Helper{

    }

    class ParkingResult{
        int status;
        String spotId;
        String vehicleNumber;
        String ticketId ;
    }


    class Vehicle{
        String number;

        Vehicle(String number){
            this.number = number;
        }
    }

//    class X_O_GAME.Car extends Vehicle{
//        X_O_GAME.Car
//    }
//    class Bike extends Vehicle{ }

    enum Vehicle_Type{
        CAR,BIKE;
    }

    class ParkingSpot{
        int floor;
        Vehicle vehicle;
        Vehicle_Type vehicle_type;
        boolean isOccupied;
        boolean isActive=false;
        int rpw,column;
    }

    class NotParkable extends ParkingSpot{

    }
    class ParkingSpotFactory{
        ParkingSpot getParkingSpot(int type, int floor, int available,int row,int column){
            if(type==4 && available==1){
                ParkingSpot parkingSpot= new ParkingSpot();
                parkingSpot.floor = floor;
                parkingSpot.vehicle_type = Vehicle_Type.CAR;
                parkingSpot.isActive = true;
                parkingSpot.isOccupied = false;
                parkingSpot.rpw = row;
                parkingSpot.column=column;
                return parkingSpot;
            }
            if(type==2 && available==1){
                ParkingSpot parkingSpot= new ParkingSpot();
                parkingSpot.floor = floor;
                parkingSpot.vehicle_type = Vehicle_Type.BIKE;
                parkingSpot.isActive = true;
                parkingSpot.isOccupied = false;
                return parkingSpot;
            }
            return new NotParkable();
        }
    }
    class ParkingFloor {
        int row;
        int column;
        int floor_number;

        HashMap<Vehicle_Type,Integer> vacantSpote = new HashMap<>();
        ParkingSpot[][] parkingSpot= new ParkingSpot[row][column];
        ParkingFloor(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }

    class PakingManager{
        ParkingStretegy parkingStretegy;
        static ParkingFloor[] parkingFloors;

        ParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory();

        PakingManager(ParkingStretegy parkingStretegy){
            this.parkingStretegy = parkingStretegy;
        }

        void initializeparkingSystem(String [][][] parking){
            int number_of_floors = parking.length;
            parkingFloors = new ParkingFloor[number_of_floors];
            for(int i=0;i<number_of_floors;i++){
                int row = parking[i].length;
                int column = parking[i][0].length;
                parkingFloors[i]=new ParkingFloor(row,column);
                for(int j=0;j<row;j++){
                    for(int k=0;k<column;k++){
                        String p = parking[i][j][k];
                        ParkingSpot parkingSpot = parkingSpotFactory
                                .getParkingSpot(p.charAt(0),i,p.charAt(2),j,k);
                        parkingFloors[i].parkingSpot[i][j]=parkingSpot;
                        if(!(parkingFloors[i].parkingSpot[i][j] instanceof NotParkable)){
                            parkingFloors[i].vacantSpote.merge(parkingSpot.vehicle_type,1,Integer::sum);
                        }
                    }
                }
            }
        }

        String park(int vehicleType, String vehicleNumber, String ticketId) throws Exception {
            int[] i =parkingStretegy.getParkingSpot(vehicleType==2?Vehicle_Type.CAR:Vehicle_Type.BIKE, parkingFloors);
            if(i[0]==0){ throw  new Exception("Parking Full"); }
            parkingFloors[i[0]].parkingSpot[i[1]][i[2]].isOccupied = true;
            parkingFloors[i[0]].parkingSpot[i[1]][i[2]].vehicle = new Vehicle(vehicleNumber);
            return i[0]+"-"+i[1]+"-"+i[2];
        }

        public ParkingResult searchBySpotId(String spotId) {
            return null;
        }

        public ParkingResult searchByVehicle(String vehicleNumber) {
            return null;
        }

        public ParkingResult searchByTicket(String ticketId) {
            return null;
        }
    }

    abstract class ParkingStretegy{

        abstract int[] getParkingSpot(Vehicle_Type vehicle_type, ParkingFloor[]  parkingFloors);
    }

    class NearrestParingSpot extends ParkingStretegy {
        @Override
        public int[] getParkingSpot(Vehicle_Type vehicle_type, ParkingFloor[]  parkingFloors) {
            for(int i=0;i<parkingFloors.length;i++){
//                Arrays.stream(parkingFloors[i].parkingSpot);
            }
            return new int[1];
        }
    }

    class MostFreeParkingSpot extends ParkingStretegy {
        @Override
        public int[] getParkingSpot(Vehicle_Type vehicle_type,ParkingFloor[]  parkingFloors) {
            return null;
        }
    }

}
