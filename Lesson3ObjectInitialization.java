package module2.chapteroop_basics;

public class Lesson3ObjectInitialization {
    int number3;
    String someText;

    public static void main(String[] args) {
       int a = 5; //variable Initialization
        //Object create

        //object
        //instance
        //reference
        Lesson3ObjectInitialization obj = new Lesson3ObjectInitialization();
        obj.number3 =3; //object initialization
        obj.someText = "Hello"; //object init


        Alien alien12345 = new Alien();
        alien12345.name = "Octopus";
        alien12345.age = 400;

        System.out.println(alien12345.name);
        System.out.println(alien12345.age);



        Alien alien12346 = new Alien();
        alien12346.name = "spaceship";
        alien12346.age = 500;

        System.out.println(alien12346.name);
        System.out.println(alien12346.age);



    }
}


class Alien {
    String name = "Pluto";

    int age = 1000;
}
//direct reference
//by method
//by constructor