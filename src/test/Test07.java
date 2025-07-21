package test;

public class Test07 {
// 1부터 100까지 숫자를 홀수는 더하고 짝수는 빼서 결과를 출력
	public static void main(String[] args) {
		int sum = 1;
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
