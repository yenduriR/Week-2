/**
 * A class representing icing sugar toppings.
 * 
 * @author Ramadevi
 *
 */
public class IcingSugar extends ToppingDecorator {
	
	/**
	 * Wrapper for baked food with icing sugar.
	 * @param bakedFood baked food
	 */
	public IcingSugar(BakedFood bakedFood) {
		this.bakedFood = bakedFood;
	}
	
	/**
	 * Returns the description using delegation.
	 * @return description
	 */
	@Override
	public String getDescription() {
		return bakedFood.getDescription() + ", Icing Sugar";
	}

	/**
	 * Returns the cost using delegation.
	 * @return cost
	 */
	@Override
	public double cost() {
		return bakedFood.cost() + 1.0;
	}
	
}
