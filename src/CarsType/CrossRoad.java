package CarsType;
import PartsFactory.IPartsFactory;

public class CrossRoad extends ICar{
    private  IPartsFactory partsFactory;
    public CrossRoad(IPartsFactory partsFactory){
        this.partsFactory = partsFactory;
        carName = "CrossRoadCar";
        carBody = "Pickup";

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
