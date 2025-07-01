package ch02;

import java.util.Scanner;

public class Q10 {
    //- 문제
    //화면에서 입력받은 수의 구구단 출력.
    //
    //- 입력
    //구하고자 하는 구구단의 수를 입력받는다.
    //N(2 ≤ N ≤ 9)이 주어진다.
    //
    //- 출력
    //해당 구구단을 출력한다.
    //
    //- 입력
    //3
    //
    //- 예제출력
    //3 × 1 = 3
    //3 × 2 = 6
    //3 × 3 = 9
    //3 × 4 = 12
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("2~9 사이 숫자를 입력해주세요");
            num = sc.nextInt();
            if (2 <= num && num <= 9) {
                break;
            }
            System.out.println("잘못 입력 하셨습니다");
        }


        for (int i = 1; i <= 9; i++) {
            int mul = num * i;
            System.out.println(num + "x" + i + "=" + mul);

        }
    }

}
