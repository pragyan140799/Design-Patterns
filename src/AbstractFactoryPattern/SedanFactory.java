package AbstractFactoryPattern;

public class SedanFactory implements VehicleFactory{

    Vehicle vehicle;

    public Vehicle getVehicle(String sedan) {
        sedan = sedan.toLowerCase();

        switch (sedan) {
            case "honda city":
                vehicle = new HondaCity();
                break;

            case "ciaz":
                vehicle = new Ciaz();
                break;

            default:
                vehicle = null;
        }

        return vehicle;
    }
}
