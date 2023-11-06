package taller;
/**
 * The Main class is the main entry class that demonstrates the calculation of
 * the cost of a vacation package using the Vacation class.
 */
public class MainClass {
/**
* The main method is the entry point of the program. 
* It demonstrates the calculation
* of the total cost of a vacation package using the Vacation class.
* The method calculates the total cost,
* and prints the results to the console.
* @param  The command-line arguments provided to the program.
*/
public static void main(final String... args) {
 final String destination = "Paris";
 final int days = 7;
 final int travelers = 6;
 //TODO Auto-generated method stub
 final Vacation vacation = new Vacation(destination, days, travelers);
 final double totalCost = vacation.calculateTotalCost();
 vacation.addAllInclusive();
 vacation.addAdventureActivities();
 vacation.addSpaAndWellness();
    }
}
