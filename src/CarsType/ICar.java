package CarsType;

import CarParts.IEngine;
import CarParts.IPaint;
import CarParts.IWheel;

public abstract class ICar {
    protected String carName = "";
    protected String carBody = "";
    protected IEngine engine;
    protected IPaint paint;
    protected IWheel wheel;

    public abstract void ConfigureCar();
    public void assembleCarBody(){
        System.out.println("Car body assembled");
    }
    public void installEngine(){
        System.out.println("Engine installed");
    }
    public void paintCar(){
        System.out.println("Car painted");
    }
    public void installWheels(){
        System.out.println("Wheels installed");
    }
}
