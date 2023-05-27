package d2;

class Hr {

	void nurse(int a, int b) {
		System.out.println("the nurse salary is" + a + b);
	}

	void doc(int x, int y, int z) {
		System.out.println(x + y - z);
	}
}

public class Main1 {
	public static void main(String[] args) {
		Hr h = new Hr();
		h.doc(50000, 5550, 2220);
		h.nurse(20000, 100);

	}
}
