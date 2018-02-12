//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob16;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//classifies Scanner utility under the variable scan.
        
        double totalSurveyed = 12467;//creates variable type double
        double oneOrmore = .14;//creates variable type double
        double citrustFlavor = .64;//creates variable type double
        double aproxNumber = totalSurveyed*.14;//creates variable type double
        double aproxNumber1 = totalSurveyed*.64;//creates variable type double
        
        System.out.println("Approximate number of customers in the survey"////////////////////
        +"\nthat purchase one or more energy drinks per week" + "\nTotal is: "+aproxNumber);////
        System.out.println("");/////////////////////////////////////FINAL TOTAL//////////////////
        System.out.println("Approximate number of customers in the survey"///////////////////////
        +"\nthat prefer citrust flavored drinks." + "\nTotal is: "+aproxNumber1);////////////////////
    }
    
    
}
