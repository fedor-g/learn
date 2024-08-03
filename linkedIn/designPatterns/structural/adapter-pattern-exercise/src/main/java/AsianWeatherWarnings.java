public class AsianWeatherWarnings {
    private WeatherWarnings weatherWarnings;

    public AsianWeatherWarnings(WeatherWarnings weatherWarnings) {
        this.weatherWarnings = weatherWarnings;
    }

    public void postWarning(City city) {
        WeatherWarnings.MAX_TEMPERATURE = 38;
        WeatherWarnings.MIN_TEMPERATURE = -8;
        weatherWarnings.postWarning(city);
    }
}
