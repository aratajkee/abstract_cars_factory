package Factories;

import CarsType.CompactCar;
import CarsType.CrossRoad;
import CarsType.ICar;
import CarsType.SportCar;
import PartsFactory.IPartsFactory;
import PartsFactory.MoscowTypeCarPartsFactory;
import PartsFactory.PenzaCarPartsFactory;

public class MoscowCarFactory extends CarFactory{
    @Override
    protected ICar createCar(String carType){
        IPartsFactory partsFactory =  new MoscowTypeCarPartsFactory();

        switch (carType){
            case "CompactCar":
                return new CompactCar(partsFactory);

            case "CrossRoadCar":
                return new CrossRoad(partsFactory);

            case "SportCar":
                return new SportCar(partsFactory);

            default:
                System.out.println("We cannot produce such car :( ");
                return null;

        }
    }
}
