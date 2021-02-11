
/**
 * A class to represent a store.
 * 
 * @author Ramadevi
 *
 */
public class Store {

	BakedFoodFactory factory;
	
	/**
	 * Create the store with baked food factory.
	 * @param factory baked food factory
	 */
	public Store(BakedFoodFactory factory) {
		this.factory = factory;
	}
	
	/**
	 * Prepare the item as per the order parameters.
	 * @param name name of the item
	 * @param type type of the item (healthy | tasty)
	 * @return baked food
	 */
	public BakedFood orderItem(String name, String type) {
		return factory.createBakedFood(name, type);
	}
	
}
