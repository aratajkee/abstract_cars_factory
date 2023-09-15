package Factories;

import CarsType.ICar;

public abstract class CarFactory  {
    protected abstract ICar createCar(String carType);
    public ICar getCar(String carType){
        ICar car = createCar(carType);

        car.ConfigureCar();
        car.assembleCarBody();
        car.paintCar();
        car.installEngine();
        car.installWheels();
        car.paintCar();
        return car;
    }
}
