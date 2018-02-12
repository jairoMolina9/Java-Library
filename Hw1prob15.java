//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob15;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//classifies Scanner utility under the variable scan.
        double totalShares = 600;//creates variable type double
        double pricePerStock = 21.77;//creates variable type double
        
        double totalStockAlone = totalShares * pricePerStock;//creates algorithm
        double comission = 0.02;//creates comission inside a double variable
        double totalStockWith = totalStockAlone * comission;//creates double with algorithm
        double finalTotal = totalStockWith + totalStockAlone;//creates double with algorithm
        
        System.out.println("Amount paid before comission: $"+totalStockAlone);////////////
        System.out.println("Amount of comission: " +totalStockWith);//////FINAL RESULT////
        System.out.println("Amount after comission: $"+finalTotal);///////////////////////
    }
}
