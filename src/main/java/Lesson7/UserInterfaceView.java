package Lesson7;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    private final Controller CONTROLLER = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите название города");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения прогноза на 1 день; Введите 5 для получения прогноза на 5 дней;" +
                    " Введите 0 для завершения.");
            String command = scanner.nextLine();
            if ("0".equals(command)) {
                break;
            } else if ("1".equals(command) || "5".equals(command)) {
                try {
                    CONTROLLER.getWeather(command, city);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}