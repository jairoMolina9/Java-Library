//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob12;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//classifies Scanner utility under the variable scan.
        String favcity;//creates a variable type string
        System.out.println("Enter your favorite city: ");//displays string
        favcity = scan.nextLine();//gets users input and stores it into favcity variable
        
        System.out.println("There are "+favcity.length()+" characters in this city name");//displays length
        System.out.println("The city in all upper case looks like this: "+favcity.toUpperCase());//displays upper case
        System.out.println("The city in all lowe case looks like this: "+favcity.toLowerCase());//displays lower case
        System.out.println("The first letters of the city is: "+favcity.charAt(0));//displays first character of city
    }
    
    
}
