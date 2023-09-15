package CarsType;

import PartsFactory.IPartsFactory;

public class SportCar extends ICar{
    private IPartsFactory partsFactory;
    public SportCar(IPartsFactory partsFactory){
        this.partsFactory = partsFactory;
        carName = "SportCar";
        carBody = "Coupe";

    }
    @Override
    public void ConfigureCar(){
        System.out.println("Configuring " + carName);
        System.out.println("Body is " + carBody);

        engine = partsFactory.createEngine();
        paint = partsFactory.createPaint();
        wheel = partsFactory.createWheel();
    }
}
