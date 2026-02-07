package day3;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = new String("jAVa");
		String s4 = "Java";
		
		System.out.printf("s1 == s2 %b%n", s1 == s2);
		System.out.printf("s1 == s3 %b%n", s1 == s3);
		System.out.printf("s1 == s4 %b%n", s1 == s4);
		
		System.out.println(s1.equals(s4));
	}
	
}
