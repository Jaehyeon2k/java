package first;

import java.util.Scanner;

class ParentCat {
	public String breed = "삼 고양이";

	void methodParentCat() {
		System.out.println("어미 고양이");
	}

	void speak() {
		System.out.println("야옹~");
	}
}

class Kitten extends ParentCat {
	void methodKitten() {
		System.out.println("아기 고양이");
	}

	@Override
	void speak() {
		System.out.println("미야옹~ 아기 고양이");
	}
}

public class r123 {

	public static void main(String[] args) {
		Kitten cat1 = new Kitten();
		cat1.methodKitten();
		ParentCat cat2 = new ParentCat();
		cat1.speak();
		
		cat1.methodParentCat();
		ParentCat cat = new Kitten();
		cat.speak(); // 출력 결과: "미야옹~ 아기 고양이"

	}
}