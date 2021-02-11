/**
 * A class to represent a healthy pie.
 * 
 * @author Ramadevi
 *
 */
public class HealthyPie extends BakedFood {

	/**
	 * Create a healthy pie.
	 */
	public HealthyPie() {
		description = "A delicious pie also good for health";
		cost = 14.99;
	}

	/**
	 * Add toppings that make the pie healthy.
	 */
	@Override
	void addToppings() {
		toppings.add("Fresh Fruits");
		toppings.add("Shredded Coconuts");
	}

}
