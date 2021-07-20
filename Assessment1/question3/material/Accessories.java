package material;

import stock.Inventory;

public class Accessories extends Inventory{

	private int Aid;
	private static int price;
	
	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	public static int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Accessories(int Aid) {
		super();
		this.Aid=Aid;
		quantity++;
		lowOrderLevelQuantity=5;
		this.price=10000;
	}
}
