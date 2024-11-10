package AbstractFactoryPattern;

public class SUVFactory implements VehicleFactory {

    public Vehicle getVehicle(String suv) {
        suv = suv.toLowerCase();

        switch (suv) {
            case "safari":
                return new Safari();
            case "scorpio":
                return new Scorpio();
            default:
                return null;
        }
    }
}
