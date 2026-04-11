package day9;

import java.util.HashSet;
import java.util.Set;

import day9.entity.Student;

public class SetDemo6 {

	public static void main(String[] args) {
		// 集合單一元素: String, Integer ...
		// 集合複合元素: 自訂物件
		Set<Student> students = new HashSet<>();
		students.add(new Student("Alice", 85, 2, 20));
		students.add(new Student("Bob", 92, 1, 22));
		students.add(new Student("Jack", 67, 1, 21));
		students.add(new Student("David", 95, 1, 19));
		students.add(new Student("Eva", 77, 2, 23));
		students.add(new Student("Frank", 88, 1, 20));
		students.add(new Student("Grace", 81, 2, 20));
		students.add(new Student("Cindy", 72, 2, 21));
		students.add(new Student("Henry", 90, 2, 24));
		students.add(new Student("Ivy", 76, 2, 19));
		students.add(new Student("Alice", 85, 2, 20));
		students.add(new Student("Alice", 85, 2, 20));
		
		System.out.println("個數: " + students.size());
		students.forEach(student -> {
			System.out.println(student);	
		});
		
	}
	
}
