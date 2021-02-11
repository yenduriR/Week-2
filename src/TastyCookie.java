
/**
 * A class to represent a tasty cookie.
 * 
 * @author Ramadevi
 *
 */
public class TastyCookie extends BakedFood {

	/**
	 * Create a tasty cookie.
	 */
	public TastyCookie() {
		description = "A tasty cookie";
		cost = 7.99;
	}

	/**
	 * Add toppings that make the cookie tasty.
	 */
	@Override
	void addToppings() {
		toppings.add("Chocolate Chips");
		toppings.add("Shredded Coconuts");
	}

}
