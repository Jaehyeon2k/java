package chap5;

public class method {
	public static void method() {
		System.out.println("static 메서드입니다.");
		System.out.println(5 + 6);
		
	}
	public static void main(String[] args) {
		System.out.println("첫 번째 호출 메서드입니다");
		
		method();
		
		System.out.println("두 번쨰 호출 메서드입니다.");
		
		method();
	}

}
