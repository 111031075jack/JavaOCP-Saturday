package day11;

public class Exception4 {

	public static void main(String[] args){
		
		try {
			action();
		} catch (ArithmeticException e) {			
			System.out.println("數學錯誤");
			System.out.println("錯誤原因: " + e.getMessage());
			return; // 強制離開
		}catch (IndexOutOfBoundsException e) {
			System.out.println("陣列錯誤");
			System.out.println("錯誤原因: " + e.getMessage());
			return; // 強制離開
		}catch (Exception e) {
			System.out.println("其他錯誤");
			System.out.println("錯誤原因: " + e.getMessage());
			return; // 強制離開
		}finally {
			// 將一定要執行的程式碼放在此區段中
			// 不論是否有例外發生一定都會執行
			System.out.println("程式結束");
		}
		
	}
	
	public static void action(){
		
			int[] array = {10, 0, 5, 2};
			
			int a = array[0]; // 分子 
			int b = array[4]; // 分母 
			
			int result = a / b;
			
			System.out.println(result);	
		
		
		
	}
	
}
