package test;

public class Test06 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (sum < 100) {
				continue;
			} else {
				break;
			}
		}
		// 마지막으로 더한 수 결과값 나와야함
		System.out.println(sum);
	}

}
