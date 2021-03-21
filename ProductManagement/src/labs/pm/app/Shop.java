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
		manager.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
		manager.printProductReport(101);
		manager.reviewProduct(101, Rating.FOUR_STAR, "Nice hot cup of tea");
		manager.reviewProduct(101, Rating.TWO_STAR, "Nice hot cup of tea");
		manager.reviewProduct(101, Rating.THREE_STAR, "Nice hot cup of tea");
		manager.printProductReport(101);

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

		manager.createProduct(104, "Chocolate", BigDecimal.valueOf(2.50), Rating.NOT_RATED,
				LocalDate.now().plusDays(3));
		manager.reviewProduct(104, Rating.THREE_STAR, "Chocolate was ok");
		manager.reviewProduct(104, Rating.ONE_STAR, "Chocolate was ok");
		manager.reviewProduct(104, Rating.FIVE_STAR, "Chocolate was ok");
		manager.printProductReport(104);
	}

}
