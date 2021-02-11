/**
 * 
 * @author Ramadevi
 *
 */
public class Week1 {

	/**
	 * Prints description and cost of the baked food item.
	 * @param bakedFood baked food item
	 */
	public static void print(BakedFood bakedFood) {
		System.out.printf("%s ($%.2f)\n", bakedFood.getDescription(), bakedFood.cost());
	}
	
	public static void main(String[] args) {
		
		// cake with no toppings
		BakedFood cake = new Cake();
		print(cake);
		
		// cake with topping
		BakedFood cake2 = new ChocolateChips(new Cake());
		print(cake2);
		
		// cake with topping
		BakedFood cake3 = new IcingSugar(new Cake());
		print(cake3);
		
		// pie with no toppings
		BakedFood pie = new Pie();
		print(pie);
		
		// pie with topping
		BakedFood pie2 = new FreshFruits(new Pie());
		print(pie2);
		
		// cookie with no toppings
		BakedFood cookie = new Cookie();
		print(cookie);
		
		// cookie with topping
		BakedFood cookie2 = new FreshFruits(new Cookie());
		print(cookie2);
		
		// cookie with two toppings
		BakedFood cookie3 = new ShreddedCoconuts(new ChocolateChips(new Cookie()));
		print(cookie3);
		
	}

}
