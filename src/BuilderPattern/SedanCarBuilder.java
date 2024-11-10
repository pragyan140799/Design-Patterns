package BuilderPattern;

public class SedanCarBuilder implements CarBuilder {

    private Car car;

    public SedanCarBuilder(Car car) {
        this.car = car;
    }

    @Override
    public void buildEngine() {
         car.setEngine("3 cylinder engine");
    }

    @Override
    public void buildwWheels() {
       car.setWheels(4);
    }

    @Override
    public void buildColor() {
     car.setColor("Red");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
