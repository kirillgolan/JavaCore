package Lesson4;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        String[] words = {"один", "раз", "два", "три", "раз", "два", "раз", "два", "раз", "два", "три",
                "раз", "два", "три", "четыре", "раз", "два","три","четыре","пять"};
        // 20 слов, 15 уникальных
        System.out.println("Иcходный массив : "+Arrays.toString(words)+" всего элементов —"+words.length);
        HashSet set = new HashSet(Arrays.asList(words));
        System.out.println("Список уникальных слов : " + set+" всего элементов —"+set.size());
        HashMap<String, Integer> frequency = new HashMap<>();
        for (String i:words){
            frequency.put(i, Collections.frequency(Arrays.asList(words),i));
        }
        System.out.println("Подсчет вхождений : "+frequency+"\n");

        // Задание 2
        PhoneBook pb = new PhoneBook();
        pb.add("Иванов","84262260011");
        pb.add("Петров","84262220011");
        pb.add("Иванов","84262260022");
        pb.add("Сидоров","84262260023");
        System.out.println("Телефонная книга : "+pb);
        System.out.println("Совпадения для «Иванов» : "+pb.get("Иванов"));

    }

}