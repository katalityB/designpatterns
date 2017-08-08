package designpatterns.observer.builtin;

public class WeatherApp1 {
    public static void observer(){
        WeatherData wd = new WeatherData();
        CurrentDisplay cd = new CurrentDisplay(wd);
        System.out.println("Built in Observer:");
        wd.setMeasurements(31,79,769);
        wd.setMeasurements(15,78,768);
    }
}
