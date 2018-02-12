//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob11;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//classifies Scanner utility under the variable scan.
        double price;//creates a variable type double
        System.out.println("Enter the retail price for each circuit board: ");//displays string
        price = scan.nextDouble();//scans user input into price variable
        
        double total = price * 0.4;//algorithm
        
        System.out.println("Total profit made: "+total+"$");//displays string

    }
    
    
}
