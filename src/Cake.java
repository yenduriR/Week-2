
/**
 * A class to represent a cake.
 * 
 * @author Ramadevi
 *
 */
public class Cake extends BakedFood {

	/**
	 * Prepare cake.
	 */
	public Cake() {
		description = "A mouth-watering cake";
	}
	
	/**
	 * Returns the cost.
	 * @return cost
	 */
	@Override
	public double cost() {
		return 19.99;
	}

}
