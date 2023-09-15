package PartsFactory;

import CarParts.*;


public class PenzaCarPartsFactory implements IPartsFactory{
    @Override
    public IEngine createEngine(){
        return new PropaneEngine();
    }
    @Override
    public IPaint createPaint(){
        return new BlackPaint();
    }
    @Override
    public IWheel createWheel(){
        return new BigWheel();
    }
}
