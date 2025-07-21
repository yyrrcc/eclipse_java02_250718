package test;

public class Test03 {
// 1부터 100까지의 수 중 홀수의 합을 출력
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
