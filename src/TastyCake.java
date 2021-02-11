
/**
 * A class to represent a tasty cake.
 * 
 * @author Ramadevi
 *
 */
public class TastyCake extends BakedFood {

	/**
	 * Create a tasty cake.
	 */
	public TastyCake() {
		description = "A mouth-watering cake";
		cost = 15.99;
	}

	/**
	 * Add toppings that make the cake tasty.
	 */
	@Override
	void addToppings() {
		toppings.add("Chocolate Chips");
		toppings.add("Icing Sugar");
	}

}
