import Factories.CarFactory;
import Factories.MoscowCarFactory;
import Factories.PenzaCarFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CarFactory carFactory = new MoscowCarFactory();

        carFactory.getCar("CrossRoadCar");
        System.out.println("\n\n");

        carFactory.getCar("CompactCar");
        carFactory.getCar("coolcar");

        carFactory = new PenzaCarFactory();
        carFactory.getCar("coolCar");
    }
}