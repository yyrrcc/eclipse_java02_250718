package loop;

public class LoopFor02 {

	public static void main(String[] args) {
		// 중첩 for
		for (int i = 0; i < 5; i++) {
			System.out.println("title");
			for (int j = 0; j < 3; j++) {
				System.out.println("z");
			}
		}
		System.out.println("------------------------");

		// * 만들기
		for (int i = 0; i < 5; i++) {
			System.out.println("*");
		}
		System.out.println("------------------------");

		// ***** 만들기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------");

		// * ** *** **** 만들기
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------");

		// **** *** ** * 만들기
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------");

	}

}
