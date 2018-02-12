//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob3;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);//creates scanner named scan
        String name, city, state,collegemajor,phonenumb;//creates multiple strings
        int zip;//creates a variable type int named zip
        
        System.out.println("Enter your name: ");//displays this string 
        name = scan.nextLine();//scans the user's input and places it inside the variable
        System.out.println("Enter your address, lets start with city: ");//displays this string 
        city = scan.nextLine();//scans the user's input and places it inside the variable
        System.out.println("Enter your state: ");//displays this string 
        state = scan.nextLine();//scans the user's input and places it inside the variable
        System.out.println("Enter your ZIP: ");//displays this string 
        zip = scan.nextInt();//scans the user's input and places it inside the variable
        scan.nextLine();//skips OWL override
        System.out.println("Enter your phone number: ");//displays this string 
        phonenumb = scan.nextLine();//scans the user's input and places it inside the variable
        System.out.println("Enter your college major: ");//displays this string 
        collegemajor = scan.nextLine();//scans the user's input and places it inside the variable
        
        
        System.out.println("-------------------Personal Information---------------------");//displays this string 
        System.out.println("Name: \t\t"+name);//displays this string plus given name
        System.out.print("Address: \t"+city);//displays this string plus given city
        System.out.print(" "+state);//displays this string plus gven state
        System.out.println(" "+zip);//displays this string plus given zip
        System.out.println("Phone #: \t" + phonenumb);//displays this string plus give phone number 
        System.out.println("Major: \t\t" + collegemajor);//displays this string  plus given college major
    }   
}
