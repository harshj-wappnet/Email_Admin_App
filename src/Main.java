import java.util.Scanner;

// Email Administration Application

/* Email Administration Application is a simple project for Email Administration which
provide many functionality like generating email, password and managing email, password,
alternate email, mailbox capacity and you can also change your passwords.
* */

// main driver class
public class Main {

    //main driver method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //scanner class for user input
        Email email = new Email(); // object construction for performing many kinds of operation
        while (true) {
            //taking choice from user to perform operation he/she wants to perform
            System.out.println("WELCOME TO EMAIL ADMINISTRATION APPLICATION");
            System.out.println("Select Operation You want to perform :");
            System.out.println("1. View Generated Email and Password");
            System.out.println("2. Set Capacity of mailbox");
            System.out.println("3. Set an Alternate Email");
            System.out.println("4. Change Your password ");
            System.out.println("5. Exit ");
            System.out.print("Enter Your choice : ");
            int choice= scanner.nextInt();
            //different cases for executing above list of operations
            switch (choice){
                case 1:
                    System.out.println("Your Email is : "+email.generateCompleteEmail());
                    System.out.print("Your Password is : "+email.getPassword());
                    break;
                case 2:
                    System.out.print("Enter Capacity You want to update (Default = 500) : ");
                    int enteredChoice = scanner.nextInt();
                    email.setMailboxCapacity(enteredChoice);
                    break;
                case 3:
                    System.out.print("Enter alternate email : ");
                    String alternateEmail = scanner.next();
                    email.setAlternateEmail(alternateEmail);
                    break;
                case 4:
                    System.out.print("Enter new Password : ");
                    String updatedPassword = scanner.next();
                    email.changePassword(updatedPassword);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}