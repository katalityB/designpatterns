package designpatterns.observer.custom;

public class CurrentDisplay implements Observer, Display {
    WeatherData weatherData;

    @Override
    public void update(float temp, float hum, float pressure) {
        System.out.println("temp = [" + temp + "], hum = [" + hum + "], pressure = [" + pressure + "]");
    }

    public CurrentDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
}
