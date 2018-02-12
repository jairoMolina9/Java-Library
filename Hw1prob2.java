//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob2;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//classifies Scanner utility under the variable scan.
        Scanner key = new Scanner (System.in);//classifies Scanner utility under the variable key.
        String firstName, middleName, lastName; // creates three string variables
        char firstInitial, middleInitial, lastInitial,y;//creates three char variables
        
        System.out.println("Type 'Y' if you want to use your personal credentials"
                + "or type 'N' if you want to use the pre-made credentials");
        y = scan.next().charAt(0); //allows user to choose wether using pre-made credentials or their own.
        
        if(y == 'Y' || y == 'y'){
        System.out.println("Enter yor first name: ");//displays this string 
        firstName = key.nextLine();//scans the user's input and places it inside the variable
        System.out.println("Enter your middle name: ");//displays this string 
        middleName = key.nextLine();//scans the user's input and places it inside the variable
        System.out.println("Enter your last name: ");//displays this string 
        lastName = key.nextLine();//scans the user's input and places it inside the variable
         
        System.out.println("Enter yor first name Initial: ");//displays this string 
        firstInitial = scan.next().charAt(0);//scans the user's input and places it inside the variable
        System.out.println("Enter your middle name Initial: ");//displays this string 
        middleInitial = scan.next().charAt(0);//scans the user's input and places it inside the variable
        System.out.println("Enter your last name Initial: ");//displays this string 
        lastInitial = scan.next().charAt(0);//scans the user's input and places it inside
        System.out.println("First Name: "+firstName+"\n"+"Middle Name: "+middleName+"\n"+"Last Name: "+lastName
            + "\n \n"+"INITIALS"+"\n"+"First name: "+firstInitial+"\n"+"Middle name: "+middleInitial+"\n"+"Last name: "
                    + lastInitial); //displays your names and initials on seperate lines 
        }
        else{
            firstName = "Jairo";middleName="Andres";lastName = "Molina";//gives a string value to the variables
            firstInitial = 'J';middleInitial='A';lastInitial='M';// gives a char value to the variables
            System.out.println("First Name: "+firstName+"\n"+"Middle Name: "+middleName+"\n"+"Last Name: "+lastName
            + "\n \n"+"INITIALS"+"\n"+"First name: "+firstInitial+"\n"+"Middle name: "+middleInitial+"\n"+"Last name: "
                    + lastInitial);//displays your names and initials on seperate lines    
        }
    }   
}
