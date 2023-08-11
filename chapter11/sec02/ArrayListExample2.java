package java_study.chapter11.sec02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> initList = Arrays.asList("김철수", "김영희", "신짱구"); // asList앞에 <String> 생략됨
		List<String> list1 = new ArrayList<String>(initList);

		list1.set(0, "신영만");
		list1.remove(0);
		list1.add("몰라");

		for (String name : list1) {
			System.out.println(name);
		}

		List<Integer> list2 = Arrays.asList(3, 6, 9);
		for (int value : list2) {
			System.out.println(value);
		}
	}

}
