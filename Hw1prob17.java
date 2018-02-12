//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob17;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//classifies Scanner utility under the variable scan.
        
        double sugar = 1.5/48, butter = 1.0/48, flour = 2.75/48;//double variables that stores ingredients per cookie
        System.out.println("How many cookies do you wish to bake?");//display string
        double totalBake = scan.nextDouble();//obtains user input and stores it in double variable
        
        
        System.out.println("-------INGREDIENTS-------");///////////////////////////
        System.out.println(sugar*totalBake+ " cups of sugar");//FINAL RESULT//////
        System.out.println(butter*totalBake+ " cup(s) of butter");//ALGORITHM/////
        System.out.println(flour*totalBake+ " cups of flour");////////////////////
        
    }
    
    
}
