import AbstractFactoryPattern.*;
import BuilderPattern.Car;
import BuilderPattern.CarBuilder;
import BuilderPattern.CarFactory;
import BuilderPattern.SedanCarBuilder;
import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;
import ObserverPattern.NewsAgency;
import ObserverPattern.WeatherStation;
import StrategyPattern.BubbleSortStrategy;
import StrategyPattern.QuickSortStrategy;
import StrategyPattern.Sorter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //demo factory pattern
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Circle");
        shape.draw();
        shape = shapeFactory.getShape("rectangle");
        shape.draw();

        //demo abstract factory pattern
        //uncomment if a demo required else keep it commented as it requires user input
      /*  VehicleFactory vehicleFactory = null;
        System.out.println("enter vehicle kind(suv/sedan/hatchback): ");
        String vehicleType = sc.nextLine();
        vehicleType = vehicleType.toLowerCase();
        if(vehicleType.equals("suv"))
            vehicleFactory = new SUVFactory();
        else if(vehicleType.equals("sedan"))
            vehicleFactory = new SedanFactory();
        else if (vehicleType.equals("hatchback"))
            vehicleFactory = new HatchbackFactory();

        System.out.println("Enter vehicle name: ");
        String vehicle = sc.nextLine();
        Carshowroom carshowroom =  new Carshowroom(vehicleFactory,vehicle);
        carshowroom.getMileage();

*/

        //demo strategy pattern
        int[] array = {5, 3, 8, 6, 2};

        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(array);
        sorter.printArray(array);

        sorter.setStrategy(new QuickSortStrategy());
        sorter.sort(array);
        sorter.printArray(array);

        //demo observer pattern
        WeatherStation weatherStation = new WeatherStation();
        NewsAgency agency1 = new NewsAgency("India Today");
        NewsAgency agency2 = new NewsAgency("CNN");
        NewsAgency agency3 = new NewsAgency("BBC");

        weatherStation.registerObserver(agency1);
        weatherStation.registerObserver(agency2);
        weatherStation.registerObserver(agency3);

        weatherStation.setWeather("Hot Sunny Day");
        weatherStation.setWeather("Gloomy Rainy Day");

        //demo builder pattern
        Car car =  new Car();
        System.out.println(car.toString());
        CarBuilder carBuilder = new SedanCarBuilder(car);
        CarFactory carFactory =  new CarFactory(carBuilder);

        carFactory.build();
        car = carFactory.getCar();
        System.out.println(car.toString());
    }
    }
