package day2;

public class ScoreDemo3 {

	public static void main(String[] args) {
		// 利用陣列來儲存 5 個學生物件
		Student[] students = {
				new Student("John", 68),
				new Student("Mary", 90),
				new Student("Jack", 58),
				new Student("Rose", 75),
				new Student("Alex", 45)
			};
		
		// 利用 for 迴圈印出每一個學生資料
		for(int i=0;i<students.length;i++) {
			students[i].printScores();
		}
		
		System.out.println("================================");
		
		// 利用 for 迴圈計算總分
		int sum = 0;
		for(int i=0;i<students.length;i++) {
			sum += students[i].getScores();
		}
		
		// 平均
		double avg = sum / (double)students.length;
		
		System.out.printf("總分 %d%n", sum);
		System.out.printf("平均 %.1f%n", avg);
		
	}
	
}
