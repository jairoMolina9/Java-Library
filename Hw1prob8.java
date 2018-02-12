//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob8;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bagCookies = 40;//creates a variable type double
        double calories = 300;//creates a variable type double
        double user;//creates a variable type double
        
        System.out.println("Enter how many cookies you have devoured: ");//displays string
        user = scan.nextDouble();//scans cookies amount
        
        double total = (user / 40)*10;//algorithm
        double total2 = (total/1) *300;//algorithm
        
        System.out.println("Total calories consumed: "+total2);//displays string
    }
    
    
}
