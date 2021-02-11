
/**
 * A class to represent a healthy cake.
 * 
 * @author Ramadevi
 *
 */
public class HealthyCake extends BakedFood {

	/**
	 * Create a healthy cake.
	 */
	public HealthyCake() {
		description = "A mouth-watering cake also good for health";
		cost = 19.99;
	}

	/**
	 * Add toppings that make the cake healthy.
	 */
	@Override
	void addToppings() {
		toppings.add("Fresh Fruits");
		toppings.add("Shredded Coconuts");
	}

}
