package designpatterns.observer.custom;

public class WeatherApp {

    public static void observer(){
        WeatherData weatherData = new WeatherData();

        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);

        weatherData.setMeasurements(35,80, 800);
        weatherData.setMeasurements(29,85, 830);
    }
}
