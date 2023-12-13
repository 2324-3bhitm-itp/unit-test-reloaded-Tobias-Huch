package at.ac.htl.leonding.bhitm3.main;

public class Product {
    private int quantity;
    private int price;
    private int restockCost;
    private String name;

    public Product(int price, int restockCost, String name) {
        this.price = price;
        this.restockCost = restockCost;
        this.name = name;
        quantity = 0;
    }


    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getRestockCost() {
        return restockCost;
    }

    public String getName() {
        return name;
    }

    public void restock(int amount){
        if(amount > 0){
            this.quantity += amount;
        }

    }

    public void sell(int amount){
        if (amount > 0){
            this.quantity -= amount;
        }
    }
}
