package day2;

public class Student {

	// 只有自己能用(private)
	private String name;
	private int scores;
	
	// 建構子
	public Student(String name, int scores) {
		this.name = name;
		this.scores = scores;
	}
	
	// 方法:印出自己的成績
	public void printScores() {
		System.out.printf("學員: %s 成績: %d%n", name, scores);
	}
	
	// 方法:回傳自己的成績(給別人使用)
	public int getScores() {
		return scores;
	}
	
	//---------------------------------------------------------------
	// 共用資源(含有 static)
	// 印出所有學生的成績(類別方法 不用 new 物件就可以使用, static)
	public static void printAll(Student[] students) {
		for(int i=0;i<students.length;i++) {
			students[i].printScores();
		}
	}
	
	// 計算全班總分(類別方法 不用 new 物件就可以使用, static)
	public static int getSum(Student[] students) {
		int sum = 0;
		for(int i=0;i<students.length;i++) {
			sum += students[i].getScores();
		}
		return sum;
	}
	
	// 計算全班平均(類別方法, 不用 new 物件就可以使用)
	public static double getAvg(Student[] students) {
		int sum = getSum(students);
		double avg = sum / (double)students.length;
		return avg;
	}
	
	
	
}
