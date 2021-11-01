
public class BaseConverter {

    public static double convertToKelvin(int celsius) {
        return celsius + 273.15;
    }

    public static double convertToFahrenheit(int celsius) {
        return (9 / 5) * celsius + 32;
    }

}
