import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game is booting up...");
        System.out.println("What's your name?");

        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "! Are you excited?");


        boolean conditionMet = false;
        while (!conditionMet) {
            String excited = scanner.nextLine();
            if (excited.equalsIgnoreCase("yes")) {
                System.out.println("Great! Let's get started!");
                conditionMet = true;
            } else if (excited.equals("no")) {
                System.out.println("Darn, sorry to hear that. It's cool you're going to Mars!");
                conditionMet = true;
            } else {
                System.out.println("I don't understand. Are you excited?");

            }
        }

        int suitcases = -1;
        boolean suitcaseCondition = false;

        while (!suitcaseCondition) {
            try {
                System.out.println("How many suitcases do you want to bring, 0, 1, or 2?");
                suitcases = scanner.nextInt();
            } catch (Exception e) {
                scanner.next();
                System.out.println("We need a whole number between 0 and 2.");
            }
            if (suitcases > 2){
                System.out.println("Sorry that is too many");
            } else if(suitcases == 2) {
                System.out.println("Perfect.");
                suitcaseCondition = true;
            } else if (suitcases == 1){
                System.out.println("You pack pretty light!");
                suitcaseCondition = true;
            }
            else if (suitcases == 0){
                System.out.println("You might not be prepared.");
                suitcaseCondition = true;
            }
        }
        scanner.nextLine();

        System.out.println("What kind of animal would you like to bring?");
        String animal = scanner.nextLine();

        System.out.println("A(n) " + animal + "! What's it's name?\n");
        String animalName = scanner.nextLine();

        System.out.println("Cool so you're bringing " + animalName + " the " + animal + ". Splendid.");
        System.out.println("NASA has an interior design team offering to outfit your space ship\nYou have a couple of options for the interior decor of your ship.");
        System.out.println("A Sleek, modern Minimalism.\nB Retro vintage/space age\nC SF Hippie chic\nWhich decor would you like? Choose A, B or C");
        String decorChar = scanner.nextLine();

        String decor = "string";
        boolean decorCondition = false;
        while (!decorCondition) {
            if (decorChar.equalsIgnoreCase("a")) {
                decor = "modern";
                decorCondition = true;
            } else if (decorChar.equalsIgnoreCase("b")) {
                decor = "retro";
                decorCondition = true;
            } else if (decorChar.equalsIgnoreCase("c")) {
                decor = "Hippie";
                decorCondition = true;
            } else {
                System.out.println("Invalid entry");
            }
        }
        System.out.println("I can see it now: " + userName + " and " + animalName + " the " + animal + " surfing the celestial abyss ... in a " + decor + " spaceship.");
        System.out.println(userName + "-- the day is here! \nYou crawl into the spaceship with " + animalName + ".\nBrace for takeoff!\n5...\n4...\n3...\n2...\n1...\n");
        System.out.println("LIFTOFF");
    }
}
