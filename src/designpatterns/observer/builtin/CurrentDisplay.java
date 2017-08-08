package designpatterns.observer.builtin;
import java.util.Observable;
import java.util.Observer;

public class CurrentDisplay implements Observer, Display {
    Observable observable;
    private float temp;
    private float hum;
    private float pressure;

    public CurrentDisplay(Observable o){
        this.observable = o;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData wd = (WeatherData) o;
            this.temp = wd.getTemp();
            this.hum = wd.getHum();
            this.pressure = wd.getPressure();
            display();
        }
    }

    public void display(){
        System.out.println("temp = [" + temp + "], hum = [" + hum + "], pressure = [" + pressure + "]");
    }
}
