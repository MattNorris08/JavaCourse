import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //learning about variables

        var familyMembers = ("Mom, Dad, Jack, Bailey, Stormy");
        System.out.println("My family is " + familyMembers);
        if(familyMembers == "Mom, Dad, Jack, Bailey, Stormy"){
            System.out.println("I love my family!");
        } else{
            System.out.println("Where is everyone?");
        }

        int myAge = 14;
        System.out.println("And I am " + myAge + " years old!");

        boolean amIAnAdult = myAge >= 18;
        System.out.println(amIAnAdult);

        char symbol = '@';
        System.out.println(symbol);

        String name = "Matt, Jack";

        //variable switching

        String x = "Cat";
        String y = "Dog";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);

        //learning about scanners

        Scanner scanner = new Scanner (System.in);

        System.out.println("What is your name");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName);

        System.out.println("How old are you?");
        int userAge = scanner.nextInt();
        System.out.println("You are " + userAge + " Years old");
        scanner.nextLine();

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
        System.out.println(food + " is a good food");

    }
}
