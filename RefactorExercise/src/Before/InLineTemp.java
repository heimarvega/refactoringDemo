package Before;

public class InLineTemp {
	boolean hasDiscount(Order order) {
		  double basePrice = order.basePrice();
		  return basePrice > 1000;
		}
}
