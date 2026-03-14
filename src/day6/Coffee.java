package day6;

// 咖啡
public class Coffee extends Beverage{
	@Override // 方法複寫
	public String getName() {
		return "咖啡";
	}
	
	
	public int getCapacity() { // 容量(c.c)
		return 250;
	}
	
}
