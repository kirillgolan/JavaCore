package Lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {

    static Set<String> task1(List<StudentClass> students) {
        return students.stream()
                .map(x -> x.getAllCourses())
                .flatMap(x->x.stream())
                .map(x-> x.toString())
                .collect(Collectors.toSet());
    }

    static List<Student> task2 (List<StudentClass> students) {
        List<Student> res = students.stream()
                .sorted((x,y) -> (int) (y.getAllCourses().size() - x.getAllCourses().size()) )
                .limit(3)
                .collect(Collectors.toList());
        return res;
    }

    static List<Student> task3 (List<StudentClass> students, String toFind) {
        List<Student> res = students.stream()
                .filter(x -> x.getAllCourses().toString().contains(toFind))
                .collect(Collectors.toList());
        return res;

    }

    public static void main(String[] args) {
        List<StudentClass> students = new ArrayList<>();
        students.add(new StudentClass("Иван", "Английский, Квидич, JavaCore, Волейбол, Плавание, Стрельба"));
        students.add(new StudentClass("Марья", "Английский, Квидич, JavaCore, Волейбол, Плавание"));
        students.add(new StudentClass("Джон", "Английский, Квидич, JavaCore, Волейбол, Плавание, Стрельба, Физика"));
        students.add(new StudentClass("Альберт", "Английский, Квидич, JavaCore, Плавание, Стрельба"));
        students.add(new StudentClass("Квентин", "Английский, Квидич, JavaCore, Плавание)"));
        students.add(new StudentClass("Антон", "Квидич, JavaCore, Плавание"));
        students.add(new StudentClass("Диллон", "Квидич, JavaCore, Плавание, Стрельба, Химия, Античная история, Математика, Основы тестирования"));

        System.out.println("-- Все студенты -------------------------------");
        students.stream().forEach(System.out::println);

        // Задание 1 тест
        System.out.println("-- Задание №1 ---------------------------------");
        System.out.println(task1(students));
        System.out.println(students.stream()
                .map(x -> x.getAllCourses())
                .flatMap(x->x.stream())
                .map(x-> x.toString())
                .distinct()
                .collect(Collectors.toList())
        );

        System.out.println("-- Задание №2 ---------------------------------");
        task2(students).stream().forEach(System.out::println);

        System.out.println("-- Задание №3 ---------------------------------");
        String COURSE_NAME = "Основы тестирования";
        task3(students,COURSE_NAME).stream().forEach(System.out::println);
    }


}
