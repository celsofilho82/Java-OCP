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
		manager.printProductReport(p1);
		p1 = manager.reviewProduct(p1, Rating.FOUR_STAR, "Nice hot cup of tea");
		p1 = manager.reviewProduct(p1, Rating.TWO_STAR, "Nice hot cup of tea");
		p1 = manager.reviewProduct(p1, Rating.THREE_STAR, "Nice hot cup of tea");	
		manager.printProductReport(p1);

		Product p2 = manager.createProduct(102, "Coffee", BigDecimal.valueOf(2.99), Rating.NOT_RATED);
		p2 = manager.reviewProduct(p2, Rating.THREE_STAR, "Coffee was ok");
		p2 = manager.reviewProduct(p2, Rating.ONE_STAR, "Coffee was ok");
		p2 = manager.reviewProduct(p2, Rating.FIVE_STAR, "Coffee was ok");
		manager.printProductReport(p2);

		Product p21 = manager.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.NOT_RATED,
				LocalDate.now().plusDays(2));
		p21 = manager.reviewProduct(p21, Rating.THREE_STAR, "Cake was ok");
		p21 = manager.reviewProduct(p21, Rating.ONE_STAR, "Cake was ok");
		p21 = manager.reviewProduct(p21, Rating.FIVE_STAR, "Cake was ok");
		manager.printProductReport(p21);

		Product p211 = manager.createProduct(104, "Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED,
				LocalDate.now().plusDays(3));
		p211 = manager.reviewProduct(p211, Rating.THREE_STAR, "Chocolate was ok");
		p211 = manager.reviewProduct(p211, Rating.ONE_STAR, "Chocolate was ok");
		p211 = manager.reviewProduct(p211, Rating.FIVE_STAR, "Chocolate was ok");
		manager.printProductReport(p211);
	}

}
