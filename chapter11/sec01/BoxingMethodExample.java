package java_study.chapter11.sec01;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = Util.<Integer>boxing(100); // 뒷부분 <Integer> 생략가능
		int intValue = box1.get();

		Box<String> box2 = Util.boxing("홍길동"); // 뒷부분 <String> 생략됨
		String strValue = box2.get();
	}

}
