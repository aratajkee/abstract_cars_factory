package CarsType;

import PartsFactory.IPartsFactory;

public class CompactCar extends  ICar{
    private IPartsFactory partsFactory;
    public CompactCar(IPartsFactory partsFactory){
        this.partsFactory = partsFactory;
        carName = "CompactCar";
        carBody = "Sedan";
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
