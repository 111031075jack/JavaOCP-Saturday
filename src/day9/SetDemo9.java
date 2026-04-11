package day9;

import java.util.Comparator;
import java.util.Set;

import day9.entity.Student;

public class SetDemo9 {

	public static void main(String[] args) {
		// 集合排序 sorted
		Set<Student> students = Set.of(
				new Student("Alice", 85, 2, 20),
				new Student("Bob", 92, 1, 22),
				new Student("Jack", 67, 1, 21),
				new Student("David", 95, 1, 19),
				new Student("Eva", 77, 2, 23),
				new Student("Frank", 88, 1, 20),
				new Student("Grace", 81, 2, 20),
				new Student("Cindy", 72, 2, 21),
				new Student("Henry", 90, 2, 24),
				new Student("Ivy", 76, 2, 19)
			);
		
		// 排序前
		System.out.println("排序前: ");
		students.forEach(System.out::println);
		System.out.println("===========================");
		
		// 排序後
		System.out.println("排序後: ");
		students.stream()
				//.sorted(Comparator.comparing(Student::getScore))  自然排序 小到大
				.sorted(Comparator.comparing(Student::getScore).reversed()) // 反排序 大到小
				.forEach(System.out::println);
		
		// 印出女生最高分的前 2 名
		System.out.println("女生最高分的前 2 名");
		students.stream()
				.filter(student -> student.getSex().equals(2))
				.sorted(Comparator.comparing(Student::getScore).reversed())
				.limit(2)
				.forEach(System.out::println);
				
		
		
	}
	
}
