package day3;

import java.util.Arrays;


public class StringDemo5 {

	public static void main(String[] args) {
		String name = "Vincent,Jo,Anita,Rose,Bob,Alan";
		System.out.printf("原始資料: %s%n%n", name);
		// 1.請問有幾組人名?
		System.out.println("=== 題目 1 : 人名統計 ===");
		String[] names = name.split(",");
		System.out.printf("1. 有 %d 組人名%n", names.length);
		System.out.printf(" 人名清單: %s%n%n", Arrays.toString(names));
		
		// 2. 平均每個人名是幾個字?
		System.out.println("=== 題目 2 : 平均字數 ===");
		int totalChars = 0;
		for(int i=0;i<names.length;i++) {
			int chars = names[i].trim().length();// 除去空白後取長度
			System.out.printf("%-7s ➡ %d個字%n", names[i].trim(), chars);
			totalChars += chars;
		}
		double avg = (double)totalChars / names.length;
		System.out.printf("總字數: %d 平均: %.1f個字%n%n ", totalChars, avg);
		
		// 3.最長與最短的名字是 ?
		System.out.println("=== 題目 3 : 最長最短人名 ===");
		String longest = names[0].trim();
		String shortest = names[0].trim();
		
		for(int i=1;i<names.length;i++) {
			if(names[i].trim().length() > longest.length()) {
				longest = names[i].trim();
				continue;
			}
			if(names[i].trim().length() < shortest.length()) {
				shortest = names[i].trim();
			}
		}
		System.out.printf("最長: %s(%d字)%n", longest, longest.length());
		System.out.printf("最短: %s(%d字)%n%n", shortest, shortest.length());
		
		// 4.名字由短 -> 長排序
		// 利用超強 Java 內建集合 API 來排序
		System.out.println("=== 題目 4 :  名字由短 -> 長排序===");
		// Bubble sort
		for(int r=0;r<names.length-1;r++) {
			for(int i=0;i<names.length-1-r;i++) {
				String name1 = names[i].trim();
				String name2 = names[i+1].trim();
				// 短在前
				if(name1.length() > name2.length()) {
					// 資料對換
					String tmp = name1;
					names[i] = names[i+1];
					names[i+1] = tmp;
				}
			}
		}
		System.out.printf(" 排序後人名清單: %s%n%n", Arrays.toString(names));
	}
	
}
