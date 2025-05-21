package chap09;

public class Chicken implements Fly, Walk{

	public void fly() {
		System.out.println("닭 날다");
	}
	public void walk() {
		System.out.println("닭 걷다");
	}
}
