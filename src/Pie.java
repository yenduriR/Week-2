
/**
 * A class to represent a pie.
 * 
 * @author Ramadevi
 *
 */
public class Pie extends BakedFood {

	/**
	 * Prepare pie.
	 */
	public Pie() {
		description = "A delicious pie";
	}
	
	/**
	 * Returns the cost.
	 * @return cost
	 */
	@Override
	public double cost() {
		return 14.99;
	}

}
