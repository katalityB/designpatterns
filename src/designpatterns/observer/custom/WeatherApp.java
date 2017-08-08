package designpatterns.observer.custom;

public class WeatherApp {

    public static void observer(){
        WeatherData weatherData = new WeatherData();

        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);

        System.out.println("Custom Observer:");
        weatherData.setMeasurements(35,80, 800);
        weatherData.setMeasurements(29,85, 830);
    }
}
