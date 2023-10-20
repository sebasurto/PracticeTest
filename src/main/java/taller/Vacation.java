package taller;

public class Vacation {
	private static final int PARIS_COST = 500;
    private static final int NEW_YORK_COST = 600;
    private static final int BASE_COST = 1000;
    private static final double GROUP_DISCOUNT_10_PERCENT = 0.90; 
    private static final double GROUP_DISCOUNT_20_PERCENT = 0.80;
    private static final int PENALTY_FEE = 200;
    private static final int PROMOTION_DISCOUNT = 200;
    private static final int MAX_GROUP_SIZE = 80;

	String destination;
	int travelers;
	int daysOfVacation;
	public Vacation(String destination, int travalers, int days) {
		super();
		this.destination = destination;
		this.travelers = travalers;
		this.daysOfVacation = days;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getDaysOfVacation() {
		return daysOfVacation;
	}
	public void setDaysOfVacation(int daysOfVacation) {
		this.daysOfVacation = daysOfVacation;
	}
	public int getTravelers() {
		return travelers;
	}
	public void setTravelers(int travelers) {
		this.travelers = travelers;
	}
	public static int getParisCost() {
		return PARIS_COST;
	}
	public static int getNewYorkCost() {
		return NEW_YORK_COST;
	}
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
