package designpatterns.observer.builtin;
import java.util.Observable;

public class WeatherData extends Observable {
    private float temp;
    private float pressure;
    private float hum;

    public WeatherData(){}

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float hum, float pressure){
        this.temp = temp;
        this.hum = hum;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemp(){
        return temp;
    }

    public float getPressure(){
        return pressure;
    }

    public float getHum() {
        return hum;
    }
}
