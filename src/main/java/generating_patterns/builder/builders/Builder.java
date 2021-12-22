package generating_patterns.builder.builders;

import generating_patterns.builder.cars.CarType;
import generating_patterns.builder.component.Engine;
import generating_patterns.builder.component.GPSNavigator;
import generating_patterns.builder.component.Transmission;
import generating_patterns.builder.component.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
