package Lesson8;

import Lesson8.entity.EntityWeather;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseRepository {
    private String insertEntityWeather = "insert into weather (city, localdate, temperature) values (?, ?, ?)";
    private String getEntityWeather = "select * from weather";
    private static final String DB_PATH = "jdbc:sqlite:C:\\Users\\Кирилл\\geekbrains.db";
    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean saveEntityWeatherToDatabase(EntityWeather weather) throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB_PATH)) {
            PreparedStatement saveWeather = connection.prepareStatement(insertEntityWeather);
            saveWeather.setString(1, weather.getCity());
            saveWeather.setString(2, weather.getLocalDate());
            saveWeather.setDouble(3, weather.getTemperature());
            return saveWeather.execute();//saveWeather.execute() возвращает boolean

        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new SQLException("Сохранение не выполнено!");
    }

    public void saveEntityWeatherToDatabase(List<EntityWeather> weatherList) throws SQLException {
        // доделать метод
    }


    public List<EntityWeather> getSavedToDBWeather() {
        List<EntityWeather> entityWeatherList = new ArrayList<>();
        return entityWeatherList;
    }
}