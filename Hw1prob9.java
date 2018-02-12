//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob9;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//classifies Scanner utility under the variable scan.
        double miles, gallons;//creates two variables type double
        System.out.println("Enter the miles driven: ");//displays string
        miles = scan.nextDouble();//takes user input into 'miles' variable
        System.out.println("Enter gallons of gas used: ");//displays string
        gallons = scan.nextDouble();//takes user input into 'gallons' variable
        
        double mpg = miles/gallons;//algorithm
        
        System.out.println("-----MPG-----");/////////////
        System.out.println("Miles: "+miles);////Display
        System.out.println("Gallons: "+gallons);///Final
        System.out.println("---Result: "+mpg+"---");//////
        
    }
    
    
}
