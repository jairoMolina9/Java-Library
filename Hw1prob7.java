//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob7;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);//declares scanner as 'scan'
        double stateTax = .04, countyTax = .02;//creates two variable type doubles
        double itemValue;//creates a variable double
        
        System.out.println("Enter the amount of the purchase: ");//displays string
        itemValue = scan.nextDouble();//scans for the purchase
        
        double total = stateTax + countyTax + itemValue;//algorithm 
        System.out.println("---------Receipt---------");//////////////////////
        System.out.println("State Tax: $"+stateTax);////////////////Displays
        System.out.println("County Tax: $"+countyTax);/////////////Final
        System.out.println("Purchase Value: $"+itemValue);/////////Result
        System.out.println("-------Total: $"+total+"-------");////////////////
        
    }
    
    
}
