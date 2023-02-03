import java.util.Random;
import java.util.Scanner;

/* Email class is a main data class which manage all data related to project and also as you can see
this class  is encapulated class all data member of this class is private
 */
public class Email {

    // private data members of class
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private static final int defaultLengthPassword = 8;
    private String alternateEmail;
    private static final String company = "wappnet";
    private static final String sufix = "@gmail.com";

    /* constructor which generate email and password it takes 2 parameter from user
     first name and last name. and return email and also generate password.
    */
    public Email(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your firstname : ");
        this.firstName = scanner.next();

        System.out.print("Enter your lastname : ");
        this.lastName = scanner.next();
        setDepartment();
        generateRandomPassword(defaultLengthPassword);
    }

    // this method combines all the parameter and generate the email address for user
    public String generateCompleteEmail(){
        String finalEmail = firstName+lastName+"."+department+"."+company+sufix;
        return finalEmail;
    }

    // this method is used for returning password to user for display purpose
    public String getPassword(){
        String password = this.password;
        return password;
    }


    // this method generate random apssword and return password string to user
    private void generateRandomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%&*";
        char[] password = new char[length];
        for (int i=0;i<length;i++){
            int randomnum = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomnum);
        }
        this.password = new String(password);
    }

    // this method set department it ask user about his department and than sent that department string to generateemail method
    private void setDepartment(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n4 for hr\n0 for none\nEnter the department:");
        int choice = scanner.nextInt();
        String department="";

        if (choice == 1){
            department = "sales";
        } else if (choice == 2) {
            department = "development";
        } else if (choice == 3) {
            department = "accounting";
        } else if (choice == 4) {
            department = "hr";
        }else {
            department = "";
        }
        this.department = department;
    }

    // this method is used for upadting mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    // this method is used for updating passwords of user  this take new password from user and upadtes it
    public void changePassword(String changedPassword){
        this.password = changedPassword;
    }

    // this method is used for set alternate email.
    public void setAlternateEmail(String altenateEmail){
        this.alternateEmail = altenateEmail;
    }
}
