
public class Week2 {
	
	/**
	 * Prints description, toppings and cost of the baked food item.
	 * @param bakedFood baked food item
	 */
	public static void print(BakedFood bakedFood) {
		System.out.println("\n---- Order ----");
		System.out.println(bakedFood);
	}
	
	public static void main(String args[]) {
		
		// create factory and store
		BakedFoodFactory factory = new BakedFoodFactory();
		Store store = new Store(factory);
		
		// a tasty cake
		BakedFood tastyCake = store.orderItem("cake", "tasty");
		print(tastyCake);

		// a healthy cake
		BakedFood healthyCake = store.orderItem("cake", "healthy");
		print(healthyCake);
				
		// a tasty pie
		BakedFood tastyPie = store.orderItem("pie", "tasty");
		print(tastyPie);
		
		// a healthy pie
		BakedFood healthyPie = store.orderItem("pie", "healthy");
		print(healthyPie);
		
		// a tasty cookie
		BakedFood tastyCookie = store.orderItem("cookie", "tasty");
		print(tastyCookie);
		
		// a healthy cookie
		BakedFood healthyCookie = store.orderItem("cookie", "healthy");
		print(healthyCookie);

	}
}
