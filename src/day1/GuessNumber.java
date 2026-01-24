package day1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int ans = random.nextInt(99) + 1; // 答案 (1 ~ 99之間)
		int min = 0;
		int max = 100;
		
		do {
			// User guess
			System.out.printf("使用者請在 %d ~ %d 之間猜一個數字 =>", min, max);
			int userGuess = sc.nextInt(); // 取得使用者所猜的數字
			// 檢查數字是否有在範圍內
			if(userGuess <= min || userGuess >= max) {
				System.out.println("數字範圍錯誤");
				continue;
			}
			
			// 判斷使用者所猜的數字
			if(userGuess < ans) {
				min = userGuess;
			} else if(userGuess > ans) {
				max = userGuess;
			} else {
				System.out.printf("使用者答對了 => %d%n", ans);
				break; // 離開回圈
			}
			
			// PC guess
			int pcGuess = random.nextInt(max - min - 1) + 1 + min;
			System.out.printf("電腦請在 %d ~ %d 之間猜一個數字 => %d%n", min, max, pcGuess);
			// 判斷 PC 所猜的數字
			if(pcGuess < ans) {
				min = pcGuess;
			} else if(pcGuess > ans) {
				max = pcGuess;
			} else {
				System.out.printf("電腦答對了 => %d%n", ans);
				break; // 離開回圈
			}
			
			
		} while (true);
		
		
		sc.close();
	}
		
}
