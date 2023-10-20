package taller;

public class Vacation {
/**
 * Cost to Paris.
 */
 private static final int PARIS_COST = 500;
 /**
  * Cost to New York.
  */
 private static final int NEW_YORK_COST = 600;
 /**
  * Base Cost.
  */
 private static final int BASE_COST = 1000;
 /**
  * Cost to Paris.
  */
 private static final double GROUP_DISCOUNT_10_PERCENT = 0.90;
 /**
  * Cost to Paris.
  */
 private static final double GROUP_DISCOUNT_20_PERCENT = 0.80;
 /**
  * Cost to Paris.
  */
 private static final int PENALTY_FEE = 200;
 /**
  * Cost to Paris.
  */
 private static final int PROMOTION_DISCOUNT = 200;
 /**
  * Cost to Paris.
  */
 private static final int MAX_GROUP_SIZE = 80;
 /**
  *  Destination where do you travel.
  *
  */
  private String destination;
  /** Num of travelers. */
  private int travelers;
  /** Number of days of vacation. */
  private int daysOfVacation;
  /**
  * Constructor for the Vacation class.
  *
  * @param destinationTr The destination of the vacation.
  * @param numTrav The number of travelers.
  * @param days The number of days for the vacation.
  */
public Vacation(final String destinationTr, final int numTrav, final int days) {
  this.destination = destinationTr;
  this.travelers = numTrav;
  this.daysOfVacation = days;
 }
/**
 * @return the destination to traveling.
*/
 public String getDestination() {
  return destination;
 }
 /**
  * @param destinationTr where you go.
 */
public void setDestination(final String destinationTr) {
 this.destination = destinationTr;
}
public int getDaysOfVacation() {
 return daysOfVacation;
}
/**
 * @param days where you go.
*/
public void setDaysOfVacation(final int days) {
 this.daysOfVacation = days;
 }
 public int getTravelers() {
  return travelers;
 }
public void setTravelers(int travelers) {
 this.travelers = travelers;
}
/**
 * @return the cost to travel to Pais.
*/
 public static int getParisCost() {
  return PARIS_COST;
 }
 /**
  * @return the cost to travel to New Yrok.
 */
 public static int getNewYorkCost() {
  return NEW_YORK_COST;
 }
 /**
  * @return the base cost.
 */
 public static int getBaseCost() {
  return BASE_COST;
 }
 public static double getGroupDiscount10Percent() {
  return GROUP_DISCOUNT_10_PERCENT;
 }
 public static double getGroupDiscount20Percent() {
  return GROUP_DISCOUNT_20_PERCENT;
 }
 public static int getPenaltyFee() {
  return PENALTY_FEE;
 }
 public static int getPromotionDiscount() {
  return PROMOTION_DISCOUNT;
 }
 public static int getMaxGroupSize() {
 return MAX_GROUP_SIZE;
 }
@Override
 public String toString() {
  return "Vacation [destination=" + destination + ", travalers=" + travelers + ", days=" + daysOfVacation
+ "]";
	}
public double calculateTotalCost() {
    	if (isValidInput()) {
            double totalCost = BASE_COST;
	        if (destination.equalsIgnoreCase("Paris")) {
	            totalCost += PARIS_COST;
	        } else if (destination.equalsIgnoreCase("New York City")) {
	            totalCost += NEW_YORK_COST;
	        }
	        if (travelers > 4 && travelers < 10) {
	            totalCost *= GROUP_DISCOUNT_10_PERCENT;
	        } else if (travelers > 10) {
	            totalCost *= GROUP_DISCOUNT_20_PERCENT;
	        }
	        totalCost *= daysOfVacation;
	        if (daysOfVacation < 7) {
	            totalCost += PENALTY_FEE;
	        }
	        if (daysOfVacation > 30 || daysOfVacation == 2) {
	            totalCost -= PROMOTION_DISCOUNT;
	        }
	        return totalCost;
    	} else {
            return -1;
        }
    }
 private boolean isValidInput() {
 return (travelers >= 1 && daysOfVacation >= 1 && travelers <= MAX_GROUP_SIZE);
    }
}
