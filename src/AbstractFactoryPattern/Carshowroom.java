package AbstractFactoryPattern;

public class Carshowroom {

    Vehicle vehicle;

    public Carshowroom(VehicleFactory vehicleFactory,String vehicleName) {
        vehicle = vehicleFactory.getVehicle(vehicleName);
    }

    public void getMileage() {
        vehicle.milage();
    }
}
