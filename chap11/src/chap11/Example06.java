package chap11;

class MyExce extends Exception {
	String str1;
	MyExce(String str2){
		str1 = str2;
	}
	public String toString() {
		return("MyExce 발생 : " + str1);
	}
}
public class Example06 {
	public static void main(String[] args) {
		try {
			System.out.println("try 블록입니다.");
			throw new MyExce("MyExce 클래스 호출됩니다.");
		} catch (MyExce e) {
			System.out.println("catch 블록입니다.");
			System.out.println(e);
		}

	}

}
