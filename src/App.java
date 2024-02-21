import java.util.Scanner;
public class App {


        public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    // Accepting user input app
    System.out.println("What is your name? ");
    String name = scanner.nextLine();

    System.out.println("How old are you? ");
    int age = scanner.nextInt();

    System.out.println("What is your favorite food?");
    String food = scanner.next();

    int x;
    x = 123;
    System.out.println(x);
    // Creating name String variable
    /*  String name = "Nico"; */
    // Creating age Int variable
    /* int age = 27; */
          System.out.println("My name is: " + name);
          System.out.println("You are "+age+" years old");
          System.out.println("My favorite food is " +food);
        }
    }
