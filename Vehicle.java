package ParkingLotSys.Vehicle;

public abstract class Vehicle {
    String licenceNo;
    VehicleType vehicleType;

    public Vehicle(String licenceNo, VehicleType vehicleType) {
        this.licenceNo = licenceNo;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getLicenceNo() {
        return licenceNo;
    }
}
