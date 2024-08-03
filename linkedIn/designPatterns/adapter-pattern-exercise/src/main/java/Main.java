public class Main {

    public static void main(String[] args) {
        WeatherWarnings weatherWarnings = new WeatherWarnings();
        AsianWeatherWarnings asianWeatherWarnings = new AsianWeatherWarnings(weatherWarnings);

        NorthAmericanCity chicago = new NorthAmericanCity("Chicago", 16);
        weatherWarnings.postWarning(chicago);

        NorthAmericanCity phoenix = new NorthAmericanCity("Phoenix", 104);
        weatherWarnings.postWarning(phoenix);

        NorthAmericanCity portland = new NorthAmericanCity("Portland", 70);
        weatherWarnings.postWarning(portland);

        AsianCity bangkok = new AsianCity("Bangkok", 50);
        asianWeatherWarnings.postWarning(bangkok);

        NorthAmericanCity portland2 = new NorthAmericanCity("Portland", 0);
        weatherWarnings.postWarning(portland2);
    }

}
