package test;

public class Test04 {

	public static void main(String[] args) {
		int even = 0;
		int odd = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
		}

		System.out.println(even);
		System.out.println(odd);
	}

}
