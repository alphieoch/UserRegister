import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
//gettignt he current year
import java.util.Scanner;
//^Allow reading of user input
import java.io.File;
//^to be able to read files
import java.util.Date;
//^calling on scanner input to get the user input.
public class Main {
    //^this is where we will keep all the attributes of our code e.g. main code and i
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Hai welcome, Pls enter your name"+"\t");
        System.out.print("First Name");
        String First= sc.nextLine();
        //this will make sure the first name will always be captialised
        String FirstName= First.substring(0, 1).toUpperCase() + First.substring(1);
        //Saves the first name
        System.out.print("Second Name");
        String Second = sc.nextLine();
        String SecondName= Second.substring(0, 1).toUpperCase() + Second.substring(1);
        //Saves the Second name
        //by doing this, it will make sure the input will always be capitalised.
        System.out.print("What's your age");
        int Age= sc.nextInt();
        //Saves the age
        System.out.printf("Welcome "+"%-5s %s\n", FirstName, SecondName);
        //adds distance between the input
        //Show the year of birth
        int year = Calendar.getInstance().get(Calendar.YEAR);
        //subtract current year by age
        int DOB = year - Age;
        System.out.println("Age:"+ Age+"("+DOB+")");
        //Text file
        File File1 = new File("Users.txt");
        FileWriter fw = new FileWriter(File1);
        //adding the info into text file
        PrintWriter pw = new PrintWriter(fw);
        String FinalName = FirstName + SecondName;
        pw.write(FinalName);
        pw.write(Age);
        pw.close();
    }
}
