package day4.drink;

// 飲料基本資料
public class Drink {
	// 編號、名稱、價格 
	private int number;
	private String name;
	private int price;
	
	// 建立一個建構子來設定屬性資料
	public Drink(int number, String name, int price) {
		this.number = number;
		this.name = name;
		this.price = price;
	}
	
	// getter
	public String getDisplayName() {
		//return number + "." + name + "$" + price;
		return String.format("%d.%s $%d", number, name, price);
	}

	public int getPrice() {
		return price;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	
	
}
