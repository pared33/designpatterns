package com.example.builders;

import com.example.cars.Type;
import com.example.components.Engine;
import com.example.components.GPSNavigator;
import com.example.components.Transmission;
import com.example.components.TripComputer;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
