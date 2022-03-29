package Lesson3;

public class Main {

    public static Apple createApples(int value){
        Apple apples = new Apple(value);
        return apples;
    }

    public static Orange createOranges(int value){
        Orange oranges = new Orange(value);
        return oranges;
    }


    public static void main(String[] args) {
        System.out.println("****** Фрукты ***************************");
        System.out.println(createApples(9));
        System.out.println(createOranges(4));

        System.out.println("****** Коробки ***************************");
        Box<Apple> appleBox = new Box<>();
        appleBox.add(createApples(150));
        appleBox.add(createApples(6));
        appleBox.add(createApples(3));
        appleBox.add(createApples(8));
        System.out.println(appleBox);
        System.out.println("Общая масса коробки - "+appleBox.getWeight()+"f");

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(createOranges(8));
        orangeBox.add(createOranges(9));
        orangeBox.add(createOranges(11));
        System.out.println(orangeBox);
        System.out.println("Общая масса коробки - "+orangeBox.getWeight()+"f");

        System.out.println("****** Сравниваем коробки ***************************");
        if (orangeBox.compare(appleBox)) {
            System.out.println("Коробки равны");
        } else {
            System.out.println("Коробки не равны");
        };
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        appleBox1.add(createApples(3));
        orangeBox1.add(createOranges(2));

        System.out.println(appleBox1);
        System.out.println(orangeBox1);
        if (orangeBox1.compare(appleBox1)) {
            System.out.println("Коробки равны");
        } else {
            System.out.println("Коробки не равны");
        };

        System.out.println("****** Пересыпаем коробки ***************************");
        System.out.println(appleBox);
        System.out.println(appleBox1);

        appleBox.emptyTo(appleBox1);

        System.out.println(appleBox);
        System.out.println(appleBox1);


        orangeBox.emptyTo(appleBox1);

        System.out.println(appleBox1);
        System.out.println(orangeBox);
    }

}