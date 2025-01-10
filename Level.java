package ParkingLotSys;

import ParkingLotSys.Vehicle.Vehicle;
import ParkingLotSys.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private final int floor;
    private List<ParkingSpot> parkingSpotList;

    public Level(int floor , int carSpot , int bikeSpot , int truckSpot){
        this.floor = floor;
        parkingSpotList = new ArrayList<>();
        int spotNumber = 1;
        for(int i=0;i<carSpot;i++){
            ParkingSpot parkingSpot= new ParkingSpot(spotNumber , VehicleType.CAR);
            parkingSpotList.add(parkingSpot);
            spotNumber++;
        }

        for(int i=0;i<bikeSpot;i++){
            ParkingSpot parkingSpot= new ParkingSpot(spotNumber , VehicleType.BIKE);
            parkingSpotList.add(parkingSpot);
            spotNumber++;
        }

        for(int i=0;i<truckSpot;i++){
            ParkingSpot parkingSpot= new ParkingSpot(spotNumber , VehicleType.TRUCK);
            parkingSpotList.add(parkingSpot);
            spotNumber++;
        }
    }

    public int getFloor() {
        return floor;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public synchronized boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpotList){
            if(spot.getVehicleType() == vehicle.getVehicleType() && spot.spotAvalible()){
                spot.setParkedVehicle(vehicle);
                System.out.println("Parked Succesfully at "+ spot.getSpotNo() +" floor :" +floor);
                return true;
            }
        }
        return false;
    }

    public synchronized boolean removeParkedVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpotList){
            if(spot.getParkedVehicle() == vehicle){
                spot.removeParkedVehicle();
                System.out.println("Spot Free "+ spot.getSpotNo() +" floor :" +floor);
                return true;
            }
        }
        return false;
    }

    public void displayParkingSpots(){
        for(ParkingSpot spot : parkingSpotList){
            if(!spot.spotAvalible()){
                System.out.println(spot.getParkedVehicle().getLicenceNo());
            }
        }
    }
}
