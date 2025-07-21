package test;

public class Test05 {
// 1부터 50까지 수 중 50의 약수를 모두 출력
	public static void main(String[] args) {
//		int n = 50;
//		for (int i = 1; i <= 50; i++) {
//			if (n % i == 0) {
//				System.out.println(i);
//			}
//		}

		// 개선한 코드
		int x = 50;
		for (int j = 1; j <= x; j++) {
			if (x % j == 0) {
				System.out.println(j);
			}
		}

	}

}
