package Factories;

import CarParts.IPaint;
import CarsType.CompactCar;
import CarsType.CrossRoad;
import CarsType.ICar;
import CarsType.SportCar;
import PartsFactory.IPartsFactory;
import PartsFactory.PenzaCarPartsFactory;

public class PenzaCarFactory extends CarFactory{
    @Override
    protected ICar createCar(String carType){
        IPartsFactory partsFactory =  new PenzaCarPartsFactory();

        switch (carType){
            case "CompactCar":
                return new CompactCar(partsFactory);

            case "CrossRoadCar":
                return new CrossRoad(partsFactory);

            case "SportCar":
                return new SportCar(partsFactory);

            default:
                System.out.println("Fuk u fuking fuk");
                return null;

        }
    }
}
