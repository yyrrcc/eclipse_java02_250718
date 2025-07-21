package test;

public class Test01 {
// 1부터 100까지 정수 중 3의 배수이거나 5의 배수인 수만 출력
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
			} else {
				continue;
			}
		}
	}

}
