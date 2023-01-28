public class Main {
    public static void main(String[] args) {
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
    }
}
