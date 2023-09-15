package PartsFactory;

import CarParts.*;

public class MoscowTypeCarPartsFactory implements IPartsFactory{
    @Override
    public IEngine createEngine(){
        return new DieselEngine();
    }
    @Override
    public IPaint createPaint(){
        return new WhitePaint();
    }
    @Override
    public IWheel createWheel(){
        return new MediumWheel();
    }
}
