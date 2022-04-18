package Lesson8;


import Lesson8.entity.EntityWeather;

import java.io.IOException;
import java.util.List;

public interface WeatherModel {
    void getWeather(String selectedCity, Period period) throws IOException;

    List<EntityWeather> getSavedToDBWeather();
}