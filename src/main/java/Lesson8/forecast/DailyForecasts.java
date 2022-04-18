package Lesson8.forecast;


public class DailyForecasts {
    private String date;
    private Temperature temperature;
    private Dayweather dayweather;

    public DailyForecasts() {
    }

    public DailyForecasts(String date, Temperature temperature, Dayweather dayweather) {
        this.date = date;
        this.temperature = temperature;
        this.dayweather = dayweather;
    }

    @Override
    public String toString() {
        return "\ndate: " + date +
                ", \ntemperature:\n" + temperature +
                ", \nweather:\n" + dayweather;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Dayweather getDay() {
        return dayweather;
    }

    public void setDay(Dayweather dayweather) {
        this.dayweather = dayweather;
    }

    //public Night getNight() {
    //    return night;
    //}

    //public void setNight(Night night) {
   //     this.night = night;
   // }
}