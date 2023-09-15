package PartsFactory;

import CarParts.IEngine;
import CarParts.IPaint;
import CarParts.IWheel;

public interface IPartsFactory {
    public IEngine createEngine();
    public IWheel createWheel();
    public IPaint createPaint();
}
