package at.ac.htl.leonding.bhitm3.main;

import java.util.HashMap;
import java.util.Map;

public class Shop {
	//	private Map<Integer,Employee> mitarbeiters =new HashMap<>();
	private Map<String, Product> products = new HashMap<>();

	//	public Map<Integer, Employee> getMitarbeiters() {
	//		return mitarbeiters;
	//	}

	//	public void setMitarbeiters(Map<Integer, Employee> mitarbeiters) {
	//		this.mitarbeiters = mitarbeiters;
	//	}

	public Map<String, Product> getProducts() {
		return products;
	}

	public void setProducts(Map<String, Product> products) {
		this.products = products;
	}
}
