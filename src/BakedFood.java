import java.util.ArrayList;
import java.util.List;

/**
 * The base class for all the baked food items (Cake, Pie, Cookie, etc.)
 * 
 * @author Ramadevi
 *
 */
public abstract class BakedFood {
	
	double cost = 0.0;
	String description = "Baked Food";
	List<String> toppings = new ArrayList<>();
	
	/**
	 * Must be implemented by subclass to add the toppings.
	 */
	abstract void addToppings();
	
	/**
	 * Returns the string representation.
	 * @return string
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("ITEM: " + description + "\n");
		
		if (toppings != null) {
			result.append("TOPPINGS: ");
			
			for (int i = 0; i < toppings.size(); i++) {
				result.append(toppings.get(i));
				if (i < toppings.size() - 1) {
					result.append(", ");
				}
			}
			
			result.append("\n");
		}
		
		result.append("COST: " + String.format("$%.2f", cost));
		return result.toString();
	}
	
}
