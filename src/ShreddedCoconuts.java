/**
 * A class representing shredded coconuts toppings.
 * 
 * @author Ramadevi
 *
 */
public class ShreddedCoconuts extends ToppingDecorator {
	
	/**
	 * Wrapper for baked food with shredded coconuts.
	 * @param bakedFood baked food
	 */
	public ShreddedCoconuts(BakedFood bakedFood) {
		this.bakedFood = bakedFood;
	}
	
	/**
	 * Returns the description using delegation.
	 * @return description
	 */
	@Override
	public String getDescription() {
		return bakedFood.getDescription() + ", Shredded Coconuts";
	}

	/**
	 * Returns the cost using delegation.
	 * @return cost
	 */
	@Override
	public double cost() {
		return bakedFood.cost() + 0.5;
	}
	
}
