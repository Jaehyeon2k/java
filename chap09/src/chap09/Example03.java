package chap09;

public class Example03 {

	public static void main(String[] args) {
		Bike mybike = new Bike();
		Car mycar = new Car();
		mybike.printType();
		mybike.printBrand();
		mybike.printPrice();
		mybike.bike();
		System.out.println("--------------");
		mycar.printType();
		mycar.printBrand();
		mycar.printPrice();

	}

}
