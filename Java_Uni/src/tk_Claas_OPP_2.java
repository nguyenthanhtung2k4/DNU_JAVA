 



//  Vd chuyền tham số bên ngoai

import java.util.Scanner;

class Animal {
    String name;

    Animal(String name) { // Constructor with a String parameter
        this.name = name;
        System.out.println("Animal constructor: " + name);
    }
}

class Dog extends Animal {
    Dog(String name) { // Constructor with a String parameter
        super(name); // Call the Animal constructor with the received name
        System.out.println("Dog constructor");
    }
}


public class tk_Claas_OPP_2 {
    public static void main(String[] args) {
        // Read user input (optional)
        String userInputName = ""; // Initialize to an empty string
        if (args.length > 0) { // Check if command-line arguments are provided
            userInputName = args[0];
        } else {
            // Get user input from console (example using Scanner)
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a name for the dog: ");
            userInputName = scanner.nextLine();
        }
    
        // Create a Dog object using the received name
        Dog myDog = new Dog(userInputName);
    
        System.out.println("dog:\n" + myDog.name); // Print the Dog's name
    }
    
}
