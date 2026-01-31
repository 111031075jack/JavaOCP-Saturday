package day2;

public class ScoreDemo2 {

	public static void main(String[] args) {
		// 利用陣列把重複程式改善
		String[] names = {"John", "Mary","Jack","Rose","Alex"};
		int[] scores = {68, 90, 58, 75, 45};
		
		// 利用 for 迴圈印出所有學員成績
		for(int i=0;i<names.length;i++) {
			System.out.printf("學員: %s, 成績: %d%n", names[i], scores[i]);
		}
		
		System.out.println("==================================");
		
		// 用 for 迴圈計算總分
		int sum = 0; // 初始值
		for(int i=0;i<scores.length;i++) {
			sum = sum + scores[i];
		}
		
		double avg = sum / (double)names.length;
		
		System.out.printf("總分: %d%n", sum);
		System.out.printf("平均: %.1f", avg);
		
	}
	
}
