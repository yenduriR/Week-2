
/**
 * A class to represent a tasty pie.
 * 
 * @author Ramadevi
 *
 */
public class TastyPie extends BakedFood {

	/**
	 * Create a tasty pie.
	 */
	public TastyPie() {
		description = "A delicious pie";
		cost = 12.99;
	}

	/**
	 * Add toppings that make the pie tasty.
	 */
	@Override
	void addToppings() {
		toppings.add("Icing Sugar");
		toppings.add("Shredded Coconuts");
	}

}
