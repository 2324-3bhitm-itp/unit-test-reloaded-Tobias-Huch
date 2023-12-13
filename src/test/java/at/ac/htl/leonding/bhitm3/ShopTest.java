package at.ac.htl.leonding.bhitm3;

import at.ac.htl.leonding.bhitm3.main.Product;
import at.ac.htl.leonding.bhitm3.main.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {
	Shop shop;

	@BeforeEach
	public void setup() {
		shop = new Shop();
	}

//	@Test
//	public void testEmployee() {
//		Set<Employee> mitarbeiters = new HashSet<>();
//		mitarbeiters.add(new Employee("Flo", "+123", "1@2", 0, 1000));
//		mitarbeiters.add(new Employee("Michi", "+1234", "3@4", 1, 2000));
//		mitarbeiters.add(new Employee("Tobi", "+12345", "5@6", 2, 3000));
//
//		shop.setEmployee(mitarbeiters);
//		assertEquals(mitarbeiters, shop.getEmployees());
//	}

	@Test
	public void testProducts() {
		Map<String, Product> products = new HashMap<>();
		products.put("Seife", new Product(100, 50, "Seife"));
		products.put("Premium Seife", new Product(200, 100, "Premium Seife"));
		products.put("Gold Seife", new Product(300, 150, "Gold Seife"));

		shop.setProducts(products);
		assertEquals(products, shop.getProducts());
	}
}
