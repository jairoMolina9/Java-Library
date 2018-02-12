//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob14;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//classifies Scanner utility under the variable scan.
        double males;//creates variable type double
        double females;//creates variable type double
        System.out.println("Enter amount of males: ");//displays string
        males = scan.nextDouble();//takes user input and stores it into variable males
        System.out.println("Enter amount of females: ");//displays string
        females = scan.nextDouble();//takes user input and stores it into variable females
        
        double totalAll = males + females;//creates variable type double with result of an algorithm
        double totalM = males / totalAll;//creates variable type double with result of an algorithm
        double totalF = females / totalAll;//creates variable type double with result of an algorithm
        
        System.out.println("There are "+males+" males in the classroom");///////////////////////////////////
        System.out.println("There are "+females+" females in the classroom");/////////Final////////////////
        System.out.println("The average of males is "+totalM+" or "+ totalM*100+"%");//Result/////////////
        System.out.println("The average of female is "+totalF+" or "+ totalF*100+"%");///////////////////

    }
    
    
}
