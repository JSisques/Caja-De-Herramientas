package Logica;

public class XOR {

	public static void main(String[] args) {
		XOR test = new XOR();
		System.out.println(test.exactlyOneThree(3, 2));
	}

	public int exactlyOneThree(int x, int y) {
		if (x == 3 ^ y == 3) {
			return 1;
		} else {
			return 0;
		}

	}

}
