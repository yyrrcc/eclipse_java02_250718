package loop;

public class LoopWhile01 {

	public static void main(String[] args) {
		// while
		int i = 0;
		while (i < 5) {
			System.out.println(i + ", 숫자가 5보다 작습니다.");
			i++;
		}

		System.out.println("------------------------------------");

		// do-while
		int num = 6;
		do {
			System.out.println(num);
			num++;
		} while (num <= 9);
		System.out.println("숫자가 10보다 커져서 종료합니다.");

		System.out.println("------------------------------------");

	}

}
