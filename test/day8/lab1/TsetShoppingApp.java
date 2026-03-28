package day8.lab1;

public class TsetShoppingApp {

	public static void main(String[] args) {
		ShoppingApp app = new ShoppingApp();
		ShoppingApp.User user = app.new User("John");
		user.show();
		
		app.checkout(100);
		
	}
	
}
