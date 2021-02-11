
/**
 * A factory class to create baked food item (cake, cookie, pie).
 * 
 * @author Ramadevi
 *
 */
public class BakedFoodFactory {

	/**
	 * Creates a baked food item based on received type.
	 * @param name name of the item
	 * @param type type of the item (healthy | tasty)
	 * @return baked food item
	 */
	public BakedFood createBakedFood(String name, String type) {

		BakedFood bakedFood = null;

		// tasty menu items
		if (type.equals("tasty")) {
			if (name.equals("cake")) {
				bakedFood = new TastyCake();
			} else if (name.equals("pie")) {
				bakedFood = new TastyPie();
			} else if (name.equals("cookie")) {
				bakedFood = new TastyCookie();
			}
		} 
		
		// healthy menu items
		else if (type.equals("healthy")) {
			if (name.equals("cake")) {
				bakedFood = new HealthyCake();
			} else if (name.equals("pie")) {
				bakedFood = new HealthyPie();
			} else if (name.equals("cookie")) {
				bakedFood = new HealthyCookie();
			}
		}

		// add toppings
		if (bakedFood != null) {
			bakedFood.addToppings();
		}
		
		return bakedFood;
	}
}
