package day10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo4 {

	public static void main(String[] args) {
		
		
		List<String> fruits = List.of("apple", "banana", "apple", "orange", "banana", "apple");
		
		Map<String, Integer> result = new HashMap<>();
		for(String name : fruits) {
			result.put(name, result.getOrDefault(name, 0) + 1);
			// "apple", 1
			// "banana", 1
			//  "orange" 1
			
		}
		System.out.println(result);
	}
	
}
