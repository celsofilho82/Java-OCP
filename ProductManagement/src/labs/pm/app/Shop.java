package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;

import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.Rating;

public class Shop {

	public static void main(String[] args) {
		Product p1 = new Drink(101, "Tea", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
		Product p2 = new Drink(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
		Product p3 = new Food(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
		Product p5 = p3.applyRating(Rating.THREE_STAR);
		Product p6 = new Drink(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
		Product p7 = new Food(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR,
				LocalDate.now().plusDays(2));
		Product p8 = p2.applyRating(Rating.FIVE_STAR);
		Product p9 = p1.applyRating(Rating.TWO_STAR);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p5);
		System.out.println(p8);
		System.out.println(p9);
		System.out.println(p6.equals(p7));
	}

}
