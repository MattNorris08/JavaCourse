import java.util.Scanner;
import java.util.Random;

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

        //learning about scanners (commented out so I can run w/o answering questions every time)
        /* 
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
        */

        //learning about expressions: + - * / %

        double friends = 10;

        friends = friends + 1;
        System.out.println(friends);

        friends--;
        System.out.println(friends);

        friends = (double) friends / 3;
        System.out.println(friends);

        //learning Math

        double sideA = 3.14;
        double sideB = -10;

        double greaterThan = Math.max(sideA, sideB);

        System.out.println(greaterThan);

        //hypotenuse calc

        /* 
        double sideX;
        double sideY;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x:");
        sideX = scanner.nextDouble();
        System.out.println("Enter side y:");
        sideY = scanner.nextDouble();

        z = Math.sqrt((sideX*sideX) + (sideY*sideY));
         
        System.out.println("The hypotenuse is " + z);

        scanner.close();
        */

        //learning about random

        Random random = new Random();

        int randomOne = random.nextInt(6)+1;
        System.out.println(randomOne);

        double randomTwo = random.nextDouble();
        System.out.println(randomTwo);
    }
}
