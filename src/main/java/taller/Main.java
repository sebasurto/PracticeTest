package taller;
/**
 * The Main class is the main entry class that demonstrates the calculation of
 * the cost of a vacation package using the Vacation class.
 */
public class Main {
/**
* The main method is the entry point of the program.
* It demonstrates the calculation
* of the total cost of a vacation package using the Vacation class.
* The method
* initializes a Vacation object with specific parameters,
* calculates the total cost,
* and prints the results to the console.
*
* @param args The command-line arguments provided to the program.
*/
private static void main(final String[] args) {
 final String destination = "Paris";
 final int days = 7;
 final int travelers = 6;
 //TODO Auto-generated method stub
 Vacation vacation = new Vacation(destination, days, travelers);
 double totalCost = vacation.calculateTotalCost();
 System.out.println(vacation.toString());
 System.out.println("El costo total es: $" + totalCost);
    }
}
