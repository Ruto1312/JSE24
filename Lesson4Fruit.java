package module2.chapteroop_basics;

public class Lesson4Fruit {

    String name;

    String color;

    String size;
    public static void main(String[] args) {
        Lesson4Fruit fruit1 = new Lesson4Fruit();
        fruit1.name = "Apple";
        fruit1.color = "Red";
        fruit1.size = "small";

        System.out.println(fruit1);


        Lesson4Fruit fruit2 = new Lesson4Fruit();
        fruit2.name = "Orange";
        fruit2.color = "orange";
        fruit2.size = "small";

        System.out.println(fruit2);

        fruit2.name = "grape";
        System.out.println(fruit2.name);
    }
}
