package day5.parking;

public class Test {

	public static void main(String[] args) {
		// 封裝/繼承測試
		Car car = new Car();
		car.setSeats(4); // 方法封裝測試
		car.setPlateNumber("1234-AB"); // 繼承+方法封裝測試
		
		Bike bike = new Bike();
		bike.setElectric(false); // 方法封裝測試
		bike.setPlateNumber("5678-XY"); // 繼承+方法封裝測試
		
		System.out.printf("車牌: %s 座位數: %d%n", car.getPlateNumber(), car.getSeats());
		System.out.printf("車牌: %s 電動車: %b%n", bike.getPlateNumber(), bike.isElectric());
		
		// 多型測試 I
		//Vehicle v1 = new Car(); // 利用Vehicle宣告 car, 只可使用Vehicle資源
		//Vehicle v2 = new Bike(); // 利用Vehicle宣告 bike, 只可使用Vehicle資源
		Vehicle v1 = car; // 利用Vehicle宣告 car, 只可使用Vehicle資源
		Vehicle v2 = bike;// 利用Vehicle宣告 bike, 只可使用Vehicle資源
		
		System.out.printf("車牌: %s%n", v1.getPlateNumber());
		System.out.printf("車牌: %s%n", v2.getPlateNumber());
		
		// 多型測試 II
		Vehicle[] vehicles = {car, bike};
		for(Vehicle v : vehicles) {
			System.out.printf("車牌: %s%n", v.getPlateNumber());	
		}
			
		
		
	}
	
}
