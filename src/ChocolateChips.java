/**
 * A class representing chocolate chips toppings.
 * 
 * @author Ramadevi
 *
 */
public class ChocolateChips extends ToppingDecorator {
	
	/**
	 * Wrapper for baked food with chocolate chips.
	 * @param bakedFood baked food
	 */
	public ChocolateChips(BakedFood bakedFood) {
		this.bakedFood = bakedFood;
	}
	
	/**
	 * Returns the description using delegation.
	 * @return description
	 */
	@Override
	public String getDescription() {
		return bakedFood.getDescription() + ", Chocolate Chips";
	}

	/**
	 * Returns the cost using delegation.
	 * @return cost
	 */
	@Override
	public double cost() {
		return bakedFood.cost() + 2.0;
	}
	
}
