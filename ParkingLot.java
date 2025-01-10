package ParkingLotSys;

import ParkingLotSys.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot;
    private final List<Level> levels;

    private ParkingLot(){
        levels = new ArrayList<>();
    }

    public static synchronized ParkingLot getInstance(){
        if(parkingLot == null ) parkingLot =  new ParkingLot();
        return parkingLot;
    }

    public void addLevel(Level level){
        levels.add(level);
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(Level level : levels){
            if(level.parkVehicle(vehicle)){
                return true;
            }
        }
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle){
        for(Level level : levels){
            if(level.removeParkedVehicle(vehicle)){
                return true;
            }
        }
        return false;
    }

    public void displayParkedVehicle(){
        for(Level level : levels){
            level.displayParkingSpots();
        }

    }
}
