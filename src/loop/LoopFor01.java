// loop 반복문
package loop;

public class LoopFor01 {

	public static void main(String[] args) {
		// 문장을 5번 출력하기
		for (int i = 0; i < 5; i++) {
			System.out.println("hello world");
		}

		// 0 ~ 100 사이의 짝수만 출력
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// 1 ~ 100까지 모든 수의 합을 구하시오
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
