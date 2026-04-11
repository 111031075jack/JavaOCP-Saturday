package day9;

import java.util.IntSummaryStatistics;
import java.util.Set;

import day9.entity.Student;

public class SetDemo7 {

	public static void main(String[] args) {
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
		
		students.forEach(System.out::println);
		
		// 統計資料
		IntSummaryStatistics stat = students.stream()
											.mapToInt(Student::getScore)
											.summaryStatistics();
		System.out.println("統計物件: " + stat);
		System.out.println("個數: " + stat.getCount());
		System.out.println("總和: " + stat.getSum());
		System.out.println("平均: " + stat.getAverage());
		System.out.println("最大: " + stat.getMax());
		System.out.println("最小: " + stat.getMin());
		
	}

}
