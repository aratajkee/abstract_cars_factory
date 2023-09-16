package Factories;

import CarsType.CompactCar;
import CarsType.CrossRoad;
import CarsType.ICar;
import CarsType.SportCar;
import PartsFactory.IPartsFactory;
import PartsFactory.MoscowTypeCarPartsFactory;
import PartsFactory.PenzaCarPartsFactory;
import sun.security.mscapi.CPublicKey;

public class MoscowCarFactory extends CarFactory{
    public enum CarOptions{
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
                throw new Error("Unregistered car type!");

        }
    }
    public ICar getCar(MoscowCarFactory .CarOptions carOptions) {
        return super.getCar(carOptions.valueOf());
    }
}
