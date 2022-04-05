package Lesson5;


import java.io.*;


public class Main {
    final static String FILE = "file.csv";

    public static void saveToCSVFile(AppData data){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE))) {
            writer.write(data.getCSVDump());
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static AppData loadFromCSVFile(String file){
        String dump = "";
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line=reader.readLine())!=null){
                dump+=line+'\n';
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        AppData data = new AppData(dump);
        return data;
    }

    public static void main(String[] args) {
        int[][] array = {{100,200,123},{300,400,500},{600,700,11}};
        AppData data1 = new AppData(2,"Value 1,Value 2,Value 3",array);
        saveToCSVFile(data1);

        AppData data2 = loadFromCSVFile(FILE);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.csv"))) {
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}