package day9;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		// 取得元素集合內容並且加總
		// 將 [國] [數] [英] [英] 這四個元素放到 Set 集合中
		// Set 集合不適合放分數, 適合放科目
		Set set1 = new HashSet<>();
		set1.add("國");
		//set1.add(90);
		set1.add("數");
		//set1.add(100);
		set1.add("英");
		//set1.add(90);
		set1.add("英");
		set1.add(100); // Integer
		
		System.out.println(set1);
		
		

	}

}
