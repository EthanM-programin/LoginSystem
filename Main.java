import java.util.Scanner;

public class Main
{
    static String storedUsername = "";
    static String storedPassword = "";

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning)
        {
            System.out.println("\n1. Register\n2. Login\n3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scnr.nextInt();
            scnr.nextLine();

            if (choice == 1) {
                register(scnr);
            } else if (choice == 2) {
                login(scnr);
            } else if (choice == 3) {
                System.out.println("Thank you for using our system.");
                isRunning = false;
            } else {
                System.out.println("Invalid choice. Try again.");
            }

        }

        scnr.close();

    }

    public static void register(Scanner scnr)
    {
        System.out.print("Enter your username: ");
        storedUsername = scnr.nextLine();
        System.out.print("Enter your password: ");
        storedPassword = scnr.nextLine();

        System.out.println("Registration successful.");

    }

    public static void login(Scanner scnr)
    {
        System.out.print("Enter your username: ");
        String username = scnr.nextLine();
        System.out.print("Enter your password: ");
        String password = scnr.nextLine();

        if(username.equals(storedUsername) && password.equals(storedPassword))
        {
            System.out.println("Login successful. Welcome, " + username + ".");
        }
        else
        {
            System.out.println("Login failed. Try again.");
        }

    }

}