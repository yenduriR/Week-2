/**
 * A class to represent a healthy cookie.
 * 
 * @author Ramadevi
 *
 */
public class HealthyCookie extends BakedFood {

	/**
	 * Create a healthy cookie.
	 */
	public HealthyCookie() {
		description = "A tasty cookie also good for health";
		cost = 9.99;
	}

	/**
	 * Add toppings that make the cookie healthy.
	 */
	@Override
	void addToppings() {
		toppings.add("Shredded Coconuts");
	}

}
