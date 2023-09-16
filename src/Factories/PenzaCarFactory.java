package Factories;

import CarParts.IPaint;
import CarsType.CompactCar;
import CarsType.CrossRoad;
import CarsType.ICar;
import CarsType.SportCar;
import PartsFactory.IPartsFactory;
import PartsFactory.PenzaCarPartsFactory;

public class PenzaCarFactory extends CarFactory{

    public enum CarOptions {
        CompactCar("CompactCar"),
        CrossRoadCar("CrossRoadCar"),
        SportCar("SportCar");
        private final String value;
        CarOptions(String value) {
            this.value = value;
        }
        public String valueOf() {return value;}


    }
    @Override
    protected ICar createCar(String carType) throws Error{
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
                throw new Error("Unregistered car type!");

        }
    }
    public ICar getCar(PenzaCarFactory.CarOptions carOptions) {
        return super.getCar(carOptions.valueOf());
    }
}
