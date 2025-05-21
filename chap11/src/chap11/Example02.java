package chap11;

public class Example02 {
	public static void main(String[] agrs) {
		try {
			Integer in = new Integer("abc");
			in.intValue();
		} catch (ArithmeticException e) {
			System.out.println("예외 발생 ArithmeticException " + e);
		} catch (NumberFormatException e) {
			System.out.println("예외 발생 NumberFromatexception " + e);
		}
		System.out.println("try~catch 문의 외부 문장입니다.");
	}
}
