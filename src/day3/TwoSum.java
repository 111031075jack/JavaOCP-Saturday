package day3;

import java.util.Arrays;

// LeetCode 兩數之和(Two Sum)
public class TwoSum {

	public static void main(String[] args) {
		
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		int[] result = new int[2]; // 相當於 {0, 0}
		int length = nums.length; // 4
		// 印出初始資料
		System.out.println("印出初始資料");
		System.out.printf("nums = %s%n", Arrays.toString(nums));
		System.out.printf("result = %s%n", Arrays.toString(result));
		
		// 暴力比對
		outer: // 迴圈名字
		for(int i=0;i<length-1;i++) {
			inner: // 迴圈名字
			for(int k=i+1;k<length;k++) {
				int sum = nums[i] + nums[k];
				System.out.printf("nums[%d][%d] = %d%n", i, k, sum);
				// 判斷
				if(sum == target) {
					result[0] = i;
					result[1] = k;
					break outer;
				}
			}
			
		}
		System.out.println("\n印出結果資料");
		System.out.printf("target = %d%n", target);
		System.out.printf("result = %s%n", Arrays.toString(result));
		
	}
	
}
