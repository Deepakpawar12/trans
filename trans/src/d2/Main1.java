package d2;

import d2.Hr.Ss;

class Hr {

	void nurse(int a, int b) {
		System.out.println("the nurse salary is" + a + b);
	}

	void doc(int x, int y, int z) {
		System.out.println(x + y - z);
	}

	class Ss extends Hr {

		@Override
		void doc(int x, int y, int z) {
			// TODO Auto-generated method stub
			super.doc(x, y, z);
		}

		@Override
		void nurse(int a, int b) {
			// TODO Auto-generated method stub
			super.nurse(a, b);
		}
	}
}

public class Main1 {
	public static void main(String[] args) {
		Hr h = new Hr();
		h.doc(50000, 5550, 2220);
		h.nurse(20000, 100);
		// Ss ss = new Ss();

	}
}
