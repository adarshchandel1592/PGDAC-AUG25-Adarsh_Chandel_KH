class Product{
	private String privateID, name;
	private double price;
	
	Product(String privateID, String name, double price){
		this.privateID = privateID;
		this.name = name;
		this.price = price;
	}
	
	// Getter and Setter for privateID
    public String getPrivateID() {
        return privateID;
    }

    public void setPrivateID(String privateID) {
        this.privateID = privateID;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

abstract class CartItem{
	public abstract void calculateTotalPrice();
}

interface Discountable{
	public void applyDiscount(double percentage);
}

class Cart extends CarItem{
	
}