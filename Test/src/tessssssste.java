class Animal {
	public void Sound() {
		System.out.println("동물의 울음소리");
	}
}

class Cat extends Animal {
	public void Sound() {
		System.out.println("고양이는 야옹야옹");
	}
}

class Dog extends Animal {
	public void Sound() {
		System.out.println("강아지는 멍멍멍");
	}
}

class ParentCat {
	public String breed = "샴 고양이";

	void methodParentCat() {
		System.out.println("어미 고양이");
	}
}

class kitten extends ParentCat {
	void methodkitten() {
		System.out.println("아기 고양이");
	}
}

class Encapsulation {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
abstract class Animal1 {
	abstract void Sound();
	
	void Sleep() {
		System.out.println("zzz");
	}
}
class Cat1 extends Animal1 {
    void Sound() {
        System.out.println("고양이는 야옹야옹");
    }
}
abstract class Animal2{
	abstract void Sound();
	
	void Sleep() {
		System.out.println("zzz");
	}
}
public class tessssssste {
	public static void main(String[] args) {

		Animal an = new Animal();
		Animal an2 = new Cat();
		Animal an3 = new Dog();
		
		
		
		an2.Sound();

		kitten baby = new kitten();
		baby.methodkitten(); // 출력: 아기 고양이
		baby.methodParentCat(); // 부모 메서드도 사용 가능!
		System.out.println(baby.breed); // 부모 필드도 사용 가능!
		
		
	}

}
