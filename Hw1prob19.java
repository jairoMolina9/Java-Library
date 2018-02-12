//CSC110
//Professor Scheiman
//Jairo Molina
//Spring 2018

package hw1prob19;//DELETE THIS line if the program is not working.
import java.util.Scanner;//imports the java utility Scanner
public class Hw1prob19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//classifies Scanner utility under the variable scan.
        
        double sharesPurch = 1000;
        double joePaid = 32.87; //per share
        double totalJoePai = sharesPurch * joePaid;
        System.out.println("BUY------1000 SHARES | $33.87 PER STOCK------");
        System.out.println("Joe paid $"+totalJoePai+" for the stock.");
        double comission = totalJoePai*.2;
        System.out.println("Joe paid $"+comission+" for his broker when he bought the stock");
        double joeSold = 33.92;
        double joeSoldStock = sharesPurch * joeSold;
        System.out.println("\nSOLD------1000 SHARES | $33.92 PER STOCK------");
        System.out.println("Joe sold his stocks for $"+joeSoldStock+".");
        double comission1 = joeSoldStock*.2;
        System.out.println("Joe paid $"+comission1+" for his broker when he sold the stock");
    }
}
