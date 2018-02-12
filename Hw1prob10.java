//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob10;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//classifies Scanner utility under the variable scan.
       int scores []=new int[4];//creates an array named scores
       int total = 0; //creates a variable type integer
       for(int x = 1;x<=3;x++ ){//creates a for loop from 1 - 3
           System.out.println("Enter score for test "+ x);//displays string 
           scores[x] = scan.nextInt();//inputs x array 3 times
           total += scores[x];//adds each array to the total
       }
       double total1 = total/3;//obtains average
       System.out.println("");//creates empty line
       for(int x = 1; x<=3;x++){//creates a for loop range 1-3
           System.out.println("Test "+x+":"+scores[x]);//displays string
       }
       System.out.println("The average is: "+total1+"%");//displays string
       
    }
    
    
}
