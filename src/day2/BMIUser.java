package day2;

// 物件結構
public class BMIUser {

	// 3個資料(物件屬性)
	String name;
	double h;
	double w;
	
	// 2個邏輯(物件方法)
	private double calcBMI() {
		double bmi = w / Math.pow(h/100, 2);
		return bmi;
	}
	
	public void printBMI(){
		double bmi = calcBMI(); // 直接調用已經寫好的 BMI 計算邏輯
		System.out.println("BMI 執行資料結果:");
		System.out.printf("姓名: %s %n", name);
		System.out.printf("身高: %.1f cm %n", h);
		System.out.printf("體重: %.1f kg %n", w);
		System.out.printf("bmi: %.2f %n", bmi);
	}
	
	// 空參建構子(預設)
	public BMIUser() {
		
	}

	// 有參建構子
	public BMIUser(String name, double h, double w) {
		this.name = name;
		this.h = h;
		this.w = w;
	}
	
}
