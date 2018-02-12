//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob1;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//classifies Scanner utility under the variable scan.
        String name; //creates a variable type string
        int age;  // creates a variable type integer
        double annualPay; // creates a variable type double
        
        System.out.println("Enter yor name: ");//displays this string 
        name = scan.nextLine();//scans the user's input and places it inside the variable
        System.out.println("Enter your age: ");//displays this string 
        age = scan.nextInt();//scans the user's input and places it inside the variable
        System.out.println("Enter your desired annual pay: ");//displays this string 
        annualPay = scan.nextDouble();//scans the user's input and places it inside the variable
        
        System.out.println("My name is "+name+", my age is "+age+" and \n"
                + "I hope to earn $"+annualPay+" per year."); 
        //Prints two sentences in one statement.


    }
    
    
}
