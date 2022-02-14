package hr.fer.oop.ducan;

public class Util {
	private static int sku = 1000;
	public static String getNewSKU() {
		return String.valueOf(sku++);
	}
}
