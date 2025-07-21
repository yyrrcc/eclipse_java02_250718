package test;

public class Test06 {
// 1부터 100까지 더하다가 합이 100 이상이 되면 멈추고, 마지막으로 더한 수와 합을 출력
	public static void main(String[] args) {

		int steps = 0;
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
			steps++;
			if (sum < 100) {
				continue;
			} else {
				break;
			}
		}
		System.out.println(steps);
		System.out.println(sum);
	}

}
