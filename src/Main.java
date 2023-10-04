import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Get First Name
            System.out.print("First Name: ");
            String first = sc.nextLine();
            while (!first.matches("^[a-zA-Z]*$")) {
                System.out.println("Please enter a valid first name (text only).");
                System.out.print("First Name: ");
                first = sc.nextLine();
            }
            String firstName = first.substring(0, 1).toUpperCase() + first.substring(1);

            // Get Second Name
            System.out.print("Second Name: ");
            String second = sc.nextLine();
            while (!second.matches("^[a-zA-Z]*$")) {
                System.out.println("Please enter a valid second name (text only).");
                System.out.print("Second Name: ");
                second = sc.nextLine();
            }
            String secondName = second.substring(0, 1).toUpperCase() + second.substring(1);

            // Get Age
            System.out.print("Age: ");
            String ageStr = sc.nextLine();
            while (!ageStr.matches("^\\d+$")) {
                System.out.println("Please enter a valid age (numbers only).");
                System.out.print("Age: ");
                ageStr = sc.nextLine();
            }
            int age = Integer.parseInt(ageStr);

            // Save to file option
            System.out.print("Do you want to save the details to a file? (yes/no): ");
            String saveToFile = sc.nextLine().toLowerCase();
            if ("yes".equals(saveToFile)) {
                try (PrintWriter out = new PrintWriter("user_details.txt", "UTF-8")) {
                    out.println("First Name: " + firstName);
                    out.println("Second Name: " + secondName);
                    out.println("Age: " + age);
                }
                System.out.println("Details saved to user_details.txt.");
            }

            // Continue or Exit
            System.out.print("Do you want to enter another entry? (yes/no): ");
            String continueEntry = sc.nextLine().toLowerCase();
            if ("no".equals(continueEntry)) {
                break;
            }
        }

        sc.close();
        System.out.println("Thank you for using the program!");
    }
}
