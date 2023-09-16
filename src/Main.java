import Factories.CarFactory;
import Factories.MoscowCarFactory;
import Factories.PenzaCarFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        CarFactory carFactory = new MoscowCarFactory();
//
//        carFactory.getCar(MoscowCarFactory.CarOptions.CompactCar.valueOf());
//        System.out.println("\n\n");
//
//        carFactory.getCar("CompactCar");
//        System.out.println("\n\n");

//        carFactory.getCar("coolcar");

        CarFactory carFactory = new PenzaCarFactory();
        carFactory.getCar(PenzaCarFactory.CarOptions.CrossRoadCar.valueOf());
//        carFactory.getCar("coolCar");
    }
}