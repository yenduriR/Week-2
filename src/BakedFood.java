/**
 * The base class for all the baked food items (Cake, Pie, Cookie, etc.)
 * 
 * @author Ramadevi
 *
 */
public abstract class BakedFood {
	
	String description = "Baked Food";
	
	/**
	 * Must be implemented by subclass to return the cost.
	 * @return cost
	 */
	public abstract double cost();
	
	/**
	 * Returns the description.
	 * @return description
	 */
	public String getDescription() {
		return description;
	}
}
