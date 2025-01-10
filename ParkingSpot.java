package ParkingLotSys;

import ParkingLotSys.Vehicle.Vehicle;
import ParkingLotSys.Vehicle.VehicleType;

public class ParkingSpot {
    private final int spotNo;

    private final VehicleType vehicleType;

    private Vehicle parkedVehicle;

    public ParkingSpot(int spotNo , VehicleType vehicleType){
        this.spotNo  = spotNo;
        this.vehicleType = vehicleType;
    }

    public int getSpotNo() {
        return spotNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public boolean spotAvalible(){
        return parkedVehicle == null;
    }

    public boolean removeParkedVehicle(){
        parkedVehicle = null;
        return true;
    }
}
