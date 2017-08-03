package designpatterns.observer.custom;

public class ForecastDisplay implements Observer, Display {
    @Override
    public void update(float temp, float hum, float pressure) {
        System.out.println("temp = [" + temp + "], hum = [" + hum + "], pressure = [" + pressure + "]");
    }
}
