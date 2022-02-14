package hr.fer.oop.lab2.prob5;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		plusMinus();
		down();
		
		up();
		plusMinus();
		
		up();
		down();
		
		down();
		plusMinus();
		
		up();
		plusMinus();
	}
	
	static public void plusMinus() {
		System.out.println("+--------+");
	}
	static public void down() {
		System.out.println("\\        /");
		System.out.println(" \\______/");
	}
	static public void up() {
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
	}

}
