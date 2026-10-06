import java.util.Scanner;

// Avalanche method: Identify what is the card that has the highest interest, and go ahead and pay off what has the highest interest first,
// Get apr one by one into an array 

public class PayoffApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Make an empty arraylist to hold aprs


        double[] aprs = new double[5];

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // add apr to arraylist

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        // sort arraylist
        // print arraylist

    }
}
