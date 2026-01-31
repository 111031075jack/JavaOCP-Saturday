package day2;

public class ScoreDemo4 {

	public static void main(String[] args) {
		// 利用陣列來儲存 5 個學生物件
		Student[] students = {
				new Student("John", 68),
				new Student("Mary", 90),
				new Student("Jack", 58),
				new Student("Rose", 75),
				new Student("Alex", 45)
			};
		
		
		// 印出學生成績
		Student.printAll(students);
		
		
		// 印出總分
		System.out.printf("總分: %d%n", Student.getSum(students));
		
		
		// 印出平均
		System.out.printf("平均: %.1f%n", Student.getAvg(students));
		
		
	}
	
}
