package designpatterns.observer.custom;
import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temp;
    private float pressure;
    private float hum;
    private ArrayList observers;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void notifyObserver() {
        for(int i = 0;i<observers.size();i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temp,pressure,hum);
        }
    }

    @Override
    public void registerObserver(Observer o) {
            observers.add(o);
        }

        @Override
        public void removeObserver(Observer o) {
            int i = observers.indexOf(o);
            if(i>=0){
                observers.remove(i);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temp, float hum, float pressure){
        this.temp = temp;
        this.hum = hum;
        this.pressure = pressure;
        measurementsChanged();
    }

}
