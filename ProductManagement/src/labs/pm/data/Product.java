package labs.pm.data;

import static labs.pm.data.Rating.NOT_RATED;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

	private static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
	private int id;
	private String name;
	private BigDecimal price;
	private Rating rating;

	public Product() {
		this(0, "no name", BigDecimal.ZERO);
	}

	public Product(int id, String name, BigDecimal price, Rating rating) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}

	public Product(int id, String name, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = NOT_RATED;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Rating getRating() {
		return rating;
	}

	public BigDecimal getDiscount() {
		return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
	}

	public Product applyRating(Rating newRating) {
		return new Product(id, name, price, newRating);
	}
}
