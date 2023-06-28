import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
    // Ask for user's name
    String response = "";
    Scanner in = new Scanner(System.in);
    System.out.print("What is your name: ");
    response = in.nextLine();

    // Greet user if his/her name is Bob or Alice
    if(response.equalsIgnoreCase("Bob") || response.equalsIgnoreCase("Alice")) {
        System.out.println("Greetings " + response + "!");
    }
    else {  // Else, display user name
        System.out.println("Your name is " + response + ".");
    }
    }
}
