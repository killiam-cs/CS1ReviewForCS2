import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor method for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;
        System.out.println(isOpen);
        System.out.println("Welcome to " + name + "!");
        if (isOpen == true) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 1996;
        System.out.println("We were actually founded in " + yearFounded + " :)");

        // Calling methods
        randomDiscount();

        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("iced strawberry matcha latte");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
        CoffeeDrink drink1 = new CoffeeDrink(7,
                "vanilla", true);

        // edit the baristasChoice method to allow you to make
        // a new CoffeeDrink with the barista's choice
        // as the drink's "flavor"

        // TODO
        // Print out the order details for each coffee drink
        drink1.printInfo();


    } // end of constructor

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
        int discount = (int)(Math.random() * 31);
        System.out.println("Your random discount is " + discount + "%!");
        // while loop for getting the best discount
    }// while loop for getting the best discount

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("The special of the day is " + special + "!");
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
        for (int x = 0; x < 6; x++) {
            System.out.println(x);
        }

        // Print 2, 5, 8, 11 (try to print all on one line for extra challenge)
        for (int x = 2; x <= 11; x += 3) {
            if (x < 11) {
                System.out.print(x + ", ");
            } else {
                System.out.println(x);
            }
        }

        // Print 8 to 0
        for (int potato = 8; potato > -1; potato--) {
            System.out.println(potato);
        }
    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
        double r = Math.random();
        if (r < 0.25) {
            System.out.println("The barista recommends a latte");
        }
        if (r < .5) {
            System.out.println("cappuccino");
        } else if (r < .75) {
            System.out.println("cold whole milk");
        } else {
            System.out.println("cold water");
        }
    }
}

