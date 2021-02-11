/**
 * A class representing fresh fruits toppings.
 * 
 * @author Ramadevi
 *
 */
public class FreshFruits extends ToppingDecorator {
	
	/**
	 * Wrapper for baked food with fresh fruits.
	 * @param bakedFood baked food
	 */
	public FreshFruits(BakedFood bakedFood) {
		this.bakedFood = bakedFood;
	}
	
	/**
	 * Returns the description using delegation.
	 * @return description
	 */
	@Override
	public String getDescription() {
		return bakedFood.getDescription() + ", Fresh Fruits";
	}

	/**
	 * Returns the cost using delegation.
	 * @return cost
	 */
	@Override
	public double cost() {
		return bakedFood.cost() + 3.0;
	}
	
}
