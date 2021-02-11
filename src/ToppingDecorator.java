
/**
 * A support class to implement decorator design pattern for baked food.
 * 
 * @author Ramadevi
 *
 */
public abstract class ToppingDecorator extends BakedFood {

	BakedFood bakedFood;
	
	/**
	 * Must be implemented by subclass to return the description.
	 * @return description
	 */
	public abstract String getDescription();
}
