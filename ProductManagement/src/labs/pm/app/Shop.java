package labs.pm.app;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;

import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

public class Shop {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager(new Locale("pt", "BR"));
		Product p1 = manager.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
		manager.printProductReport();
		p1 = manager.reviewProduct(p1, Rating.FOUR_STAR, "Nice hot cup of tea");
		p1 = manager.reviewProduct(p1, Rating.TWO_STAR, "Nice hot cup of tea");
		p1 = manager.reviewProduct(p1, Rating.THREE_STAR, "Nice hot cup of tea");
		p1 = manager.reviewProduct(p1, Rating.FIVE_STAR, "Nice hot cup of tea");
		p1 = manager.reviewProduct(p1, Rating.FOUR_STAR, "Nice hot cup of tea");
		p1 = manager.reviewProduct(p1, Rating.THREE_STAR, "Nice hot cup of tea");
		
		manager.printProductReport();
//		Product p2 = manager.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
//		Product p3 = manager.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//		Product p5 = p3.applyRating(Rating.THREE_STAR);
//		Product p6 = manager.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
//		Product p7 = manager.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR,
//				LocalDate.now().plusDays(2));
//		Product p8 = p2.applyRating(Rating.FIVE_STAR);
//		Product p9 = p1.applyRating(Rating.TWO_STAR);
//
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
//		System.out.println(p5);
//		System.out.println(p8);
//		System.out.println(p9);
//		System.out.println(p6.equals(p7));
	}

}
