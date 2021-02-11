
/**
 * A class to represent a cookie.
 * 
 * @author Ramadevi
 *
 */
public class Cookie extends BakedFood {

	/**
	 * Prepare cookie.
	 */
	public Cookie() {
		description = "A tasty cookie";
	}

	/**
	 * Returns the cost.
	 * @return cost
	 */
	@Override
	public double cost() {
		return 9.99;
	}

}
