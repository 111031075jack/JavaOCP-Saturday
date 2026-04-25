package day11;

public class Exception3 {

	public static void main(String[] args) {
		int[] array = {10, 0, 5, 2};
		try {
			int a = array[0]; // 分子 
			int b = array[4]; // 分母 
			
			int result = a / b;
			System.out.println(result);	
		}catch (ArithmeticException e) {			
			System.out.println("數學錯誤");
			System.out.println("錯誤原因: " + e.getMessage());	
		}catch (IndexOutOfBoundsException e) {
			System.out.println("陣列錯誤");
			System.out.println("錯誤原因: " + e.getMessage());
		}catch (Exception e) {
			System.out.println("其他錯誤");
			System.out.println("錯誤原因: " + e.getMessage());
		}
		
		
	}
	
}
