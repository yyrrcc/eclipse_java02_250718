// loop 반복문
package loop;

public class LoopIf02 {

	public static void main(String[] args) {
		// Math 클래스
		Math.random(); // 0 ~ 1 사이 랜덤값 추출(소수점 16자리까지)
		System.out.println(Math.random());

		// 주사위를 굴려서 나온 수에 맞게 출력
		int num = ((int) (Math.random() * 6)) + 1;
		if (num == 1) {
			System.out.println("가장 낮은 숫자 1이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("행운의 번호 3이 출력되었습니다.");
		} else {
			System.out.println("꽝");
		}

	}

}
