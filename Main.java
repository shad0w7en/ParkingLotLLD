package ParkingLotSys;

import ParkingLotSys.Vehicle.Bike;
import ParkingLotSys.Vehicle.Car;
import ParkingLotSys.Vehicle.Truck;
import ParkingLotSys.Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1 , 10 , 20 , 14));

        parkingLot.addLevel(new Level(2 , 13 , 32 , 12));

        Vehicle car = new Car("XYZ");

        Vehicle bike = new Bike("ERT");

        Vehicle truck = new Truck("FGH");

        parkingLot.parkVehicle(car);

        parkingLot.parkVehicle(truck);

        parkingLot.parkVehicle(bike);

        parkingLot.displayParkedVehicle();

        parkingLot.unparkVehicle(car);
        parkingLot.unparkVehicle(bike);
        parkingLot.displayParkedVehicle();
    }
}