package day2;

public class ScoreDemo1 {

	public static void main(String[] args) {
		String name1 = "John";
		String name2 = "Mary";
		String name3 = "Jack";
		String name4 = "Rose";
		String name5 = "Alex";
		
		
		// 期末成績計算
		int score1 = 68;
		int score2 = 90;
		int score3 = 58;
		int score4 = 75;
		int score5 = 45;
		
		// 學員:成績
		System.out.printf("學員: %s, 成績: %d%n", name1, score1);
		System.out.printf("學員: %s, 成績: %d%n", name2, score2);
		System.out.printf("學員: %s, 成績: %d%n", name3, score3);
		System.out.printf("學員: %s, 成績: %d%n", name4, score4);
		System.out.printf("學員: %s, 成績: %d%n", name5, score5);
		System.out.println("==================================");
		
		// 計算總分
		int sum1 = score1 + score2 + score3 +score4 + score5;
		
		// 計算平均
		double avg = sum1 / 5.0;
		
		System.out.printf("總分: %d 平均: %.1f%n", sum1, avg);
		
	}
	
}
