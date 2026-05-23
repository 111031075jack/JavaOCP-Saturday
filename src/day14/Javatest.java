package day14;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Javatest {
	public static void main(String[] args) {
		
		Consumer<String> function = (String f) -> {System.out.println(f);};
		var fruits = List.of("apple", "orange", "banana", "lemon");
		fruits.forEach(function);
		
		
			List<String> drawing = List.of("border", "outline", "accent", "limit");
			Comparator<String> c1 = (a, b) -> b.compareTo(a);
			Comparator<String> c2 = c1.reversed();
			String strDrawing = drawing.stream().sorted(c2).collect(Collectors.joining(" "));
			System.out.println(strDrawing);
			}
			
		
	}

