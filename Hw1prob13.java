//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob13;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//classifies Scanner utility under the variable scan.
        double charge;
        
        System.out.println("Enter the charge for the meal: ");//displays string
        charge = scan.nextDouble();//stores user input in charge variable
        
        double tax = charge * .0675;//creates variable type double with result of an algorithm
        double tip = tax*.2;//creates variable type double with result of an algorithm
        double total = charge+tax+tip;//creates variable type double with result of an algorihtm
        
        System.out.println("------RECEIPT------");//////////////////////
        System.out.println("Meal Charge: $"+charge);///////////////////
        System.out.println("Tax: $"+tax);//////////////DISPLAYS////////
        System.out.println("Tip: $"+tip);/////////////TOTAL/////////////
        System.out.println("Total: $"+total);//////////////////////////
        System.out.println("\nX___________________");/////////////////
        
    }
    
    
}
