package at.ac.htl.leonding.bhitm3;

import at.ac.htl.leonding.bhitm3.main.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
	@Test
	public void given_nothing_when_creating_product_with_price_restockCost_name_then_should_be_set_appropriately() {
		int price = 15;
		int restockCost = 20;
		String name = "Clever Kakaomilch Trinkfertig";
		Product product = new Product(price, restockCost, name);
		assertEquals(product.getPrice(), price);
		assertEquals(product.getQuantity(), 0);
		assertEquals(product.getName(), name);
		assertEquals(product.getRestockCost(), restockCost);
	}

	@Test
	public void given_product_when_restocking_and_amount_greater_zero_amount_should_be_added_to_quantity() {
		Product product = new Product(15, 10, "none");
		int amount = 5;
		product.restock(amount);
		assertEquals(product.getQuantity(), amount);
	}

	@Test
	public void given_product_when_selling_and_amount_greater_zero_amount_should_be_removed_from_quantity() {
		Product product = new Product(15, 10, "none");
		int amount = 5;
		product.restock(amount);
		product.sell(3);
		assertEquals(product.getQuantity(), 2);
	}
}
