package AbstractFactoryPattern;

public class HatchbackFactory implements VehicleFactory {

    Vehicle vehicle;

    public Vehicle getVehicle(String hatchback) {
        hatchback = hatchback.toLowerCase();

        switch (hatchback) {
            case "kwid":
                vehicle = new Kwid();
                break;

            default:
                vehicle = null;
        }

        return vehicle;
    }
}
