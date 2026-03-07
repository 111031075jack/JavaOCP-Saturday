package day5.parking;

import java.util.stream.Stream;

public class TestParkingRecord2 {

	public static void main(String[] args) {
		// 優化後測試 ParkingRecord
		Car car = new Car(4, "1234-AB");
		Bike bike = new Bike(false, "5678-XY");
		
		// 最簡單: 
		Stream.of(car, bike).forEach(System.out::println);
		System.out.println("==============================");
		
		System.out.println(car);
		System.out.println(bike);
		System.out.println("==============================");
		
		Vehicle[] vehicles = {car, bike};
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}

		System.out.println("==============================");
		Stream.of(vehicles).forEach(System.out::println);
		
		// 優化後測試
		System.out.println("==============================");
		ParkingRecord record1 = new ParkingRecord(car, 1, 2);
		ParkingRecord record2 = new ParkingRecord(bike, 2, 1);
		
		System.out.println(record1);
		System.out.println(record2);
		System.out.println("==============================");
		ParkingRecord[] parkingRecords = {record1, record2};
		for(ParkingRecord record : parkingRecords) {
			System.out.println(record);
		}
		
		System.out.println("==============================");
		Stream.of(record1, record2).forEach(System.out::println);
		
	}

}
