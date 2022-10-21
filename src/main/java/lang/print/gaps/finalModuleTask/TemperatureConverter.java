package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        int fahrenheit;
        fahrenheit = (temperatureCelsius * (int)1.8) + 32;
        System.out.println(fahrenheit);
    }
}
