package material;

import stock.Inventory;

public class Laptops extends Inventory{

	int Lid;
	static int price;
	public static int getprice() {
		return price;
	}
	public static void setPrice(int price) {
		price = price;
	}
	public Laptops(int Lid)
	{
		super();
		this.Lid=Lid;
		quantity++;
		lowOrderLevelQuantity=3;
		this.price=400000;
	}
	
}
