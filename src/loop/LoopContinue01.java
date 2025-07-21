package loop;

public class LoopContinue01 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
				// 값이 true가 되면 컨티뉴 다음은 실행 되지 않고 다시 위로 올라감
			}
			System.out.println(i);
		}

	}

}
