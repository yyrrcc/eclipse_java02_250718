package test;

public class Test05 {
// 1부터 50까지 수 중 50의 약수를 모두 출력
	public static void main(String[] args) {
		int n = 50;
		for (int i = 1; i <= 50; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

	}

}
