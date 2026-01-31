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
	
	
}
