import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class PayoffApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Make an empty arraylist to hold aprs
        // double[] aprs = new double[5];
        List<Double> aprs = new ArrayList<>();

        while (scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // add apr to arraylist
            aprs.add(apr);

            // Consume \n after balance input
            if (scan.hasNextLine()) scan.nextLine();

            // Old printing code
            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString
            //         + " Balance: " + balanceString);

            CreditCard card = new CreditCard(name, apr, balance);
            System.out.println(card);
        }

        // sort arraylist
        Collections.sort(aprs, Comparator.reverseOrder());

        // print arraylist
        System.out.println(aprs);
    }
}