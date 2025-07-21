package test;

public class Test04 {
// 1부터 100까지의 수 중 홀수 개수와 짝수 개수를 출력
	public static void main(String[] args) {
		int even = 0; // evenCount 변수이름
		int odd = 0; // oddCount

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				even += 1; // evenCount++;
			} else {
				odd += 1; // evenCount++;
			}
		}

		System.out.println(even);
		System.out.println(odd);
	}

}
