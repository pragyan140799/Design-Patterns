package BuilderPattern;

public class CarFactory {

    private CarBuilder carBuilder;

    public CarFactory(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public void build(){
        carBuilder.buildEngine();
        carBuilder.buildwWheels();
        carBuilder.buildColor();
    }

    public Car getCar(){
        return this.carBuilder.getCar();
    }
}
