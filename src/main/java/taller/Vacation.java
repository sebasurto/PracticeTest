package taller;
/**
 * This class contain all logic of vacation
 */
public class Vacation {
/**
 * Cost to PARIS.
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
  *DISCOUNT_10_PERCENT.
  */
 private static final double GROUP_DISCOUNT_10_PERCENT = 0.90;
 /**
  * DISCOUNT_10_PERCENT.
  */
 private static final double GROUP_DISCOUNT_20_PERCENT = 0.80;
 /**
  * PENALTY_FEE.
  */
 private static final int PENALTY_FEE = 200;
 /**
  * PROMOTION_DISCOUNT.
  */
 private static final int PROMOTION_DISCOUNT = 200;
 /**
  * MAX_GROUP_SIZE.
  */
 private static final int MAX_GROUP_SIZE = 80;
 /**
  *  Destination where do you travel.
  *
  */
  private String destination;
  /** Number of travelers. */
  private int travelers;
  /** Number of days of vacation. */
  private int daysOfVacation;
  private boolean allInclusive;
  private boolean adventureActivities;
  private boolean spaAndWellness;
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
  this.allInclusive = false;
  this.adventureActivities = false;
  this.spaAndWellness = false;
 }
public void addAllInclusive() {
    allInclusive = true;
}

public void addAdventureActivities() {
    adventureActivities = true;
}

public void addSpaAndWellness() {
    spaAndWellness = true;
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
/**
 * days.
 *
 *@return the days of vacation
 */
public int getDaysOfVacation() {
 return daysOfVacation;
}
/**
 * @param days where you go.
*/
public void setDaysOfVacation(final int days) {
 this.daysOfVacation = days;
 }
/**
 *
 * @return the travelers
 */
 public int getTravelers() {
  return travelers;
 }
 /**
  *Travelers to travel.
  *
  * @param travelerss
  */
public void setTravelers(final int travelerss) {
 this.travelers = travelerss;
}
/**
 * @return the cost to travel to PARIS.
*/
 public static int getParisCost() {
  return PARIS_COST;
 }
 /**
  * @return the cost to travel to New York.
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
 /**
  *
  * @return group discount
  */
 public static double getGroupDiscount10Percent() {
  return GROUP_DISCOUNT_10_PERCENT;
 }
 /**
  *
  * @return GROUP_DISCOUNT_20_PERCENT
  */
 public static double getGroupDiscount20Percent() {
  return GROUP_DISCOUNT_20_PERCENT;
 }
 /**
  *
  * @return PENALTY_FEE
  */
 public static int getPenaltyFee() {
  return PENALTY_FEE;
 }
 /**
  *
  * @return PROMOTION_DISCOUNT
  */
 public static int getPromotionDiscount() {
  return PROMOTION_DISCOUNT;
 }
 /**
  *
  * @return MAX_GROUP_SIZE
  */
 public static int getMaxGroupSize() {
 return MAX_GROUP_SIZE;
 }
 /**
  *
  */
@Override
 public String toString() {
    final String one = "Vacation [destination=" + destination + ", travalers=";
    final String two = travelers + ", days=" + daysOfVacation + "]";
  return  one + two;
}
/**
 *
 * @return the total cost.
 */
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
            if (allInclusive) {
            	totalCost += travelers * 200;
            }
            if (adventureActivities) {
            	totalCost += travelers * 150;
            }
            if (spaAndWellness) {
            	totalCost += travelers * 100;
            }

            return totalCost;
            } else {
             return -1;
        }
    }
 private boolean isValidInput() {
 return travelers >= 1 && daysOfVacation >= 1 && travelers <= MAX_GROUP_SIZE;
    }
}
