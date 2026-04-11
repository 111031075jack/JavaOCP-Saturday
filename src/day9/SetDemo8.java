package day9;

import java.util.Set;

import day9.entity.Student;

public class SetDemo8 {

	public static void main(String[] args) {
		// 男女平均各為多少 ?
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
		
		// 全部學生
		System.out.println("全部學生:");
		students.forEach(System.out::println);
		System.out.println("===========================");
		// 學生男 (利用 filter 過濾器過濾)
		double avgOfMan = students.stream()
								  //.peek(System.out::println)
								  .filter(student -> student.getSex().equals(1))
								  //.peek(System.out::println)
								  .mapToInt(student -> student.getScore())
								  //.peek(System.out::println)
								  .average()
								  .orElse(0);
		System.out.println("男生平均: " + avgOfMan);
		
		// 學生女 
		double avgOfWoman = students.stream()
									.filter(student -> student.getSex().equals(2))
									.mapToInt(Student::getScore)
									.average()
									.orElse(0);
		System.out.println("女生平均: " + avgOfWoman);
		
		
		
	}
	
}
