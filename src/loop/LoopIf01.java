// loop 반복문
package loop;

public class LoopIf01 {

	public static void main(String[] args) {
		// 점수가 90점 이상이면 A, 80점 이상이면 B .. 60점 미만이면 F
		int score = 95;

		if (score >= 90) {
			System.out.println("당신의 학점은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("당신의 학점은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("당신의 학점은 C 입니다.");
		} else if (score >= 60) {
			System.out.println("당신의 학점은 D 입니다.");
		} else {
			System.out.println("당신은 F를 받아서 과락입니다.");
		}

		int value = 15;
		if (value >= 10 && value < 20) {
			System.out.println("값이 10이상 20이하 입니다.");
		}
	}

}