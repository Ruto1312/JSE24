package module2.chapteroop_basics;

import java.util.Scanner;

public class Lesson8ReturnIf {

    static String validate() {
        System.out.println("Enter your age:");
        int userInput = new Scanner(System.in).nextInt();

        if(userInput > 18) {
            return " can ";
        }
        return " can't ";
    }

    static void validate1() {
        System.out.println("Enter your age:");
        int userInput = new Scanner(System.in).nextInt();

        if (userInput > 18) {
            System.out.println("You can vote");
        }
        else {
            System.out.println("You can't vote");
        }
    }

    public static void main(String[] args) {
        String result = validate();
        System.out.println("you" + result);
    }

}

