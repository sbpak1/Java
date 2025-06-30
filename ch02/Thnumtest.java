package ch02;

import java.util.Scanner;

public class Thnumtest {
    // 세 수를 입력
    // 가장 큰 수와 가장 작은 수를 출력
    static Scanner sc = new Scanner(System.in);
    // (static 적는 이유)위에 적은 스캐너를 공용으로 사용하기 위해
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("세 수를 차례로 입력하세요");
        // 처음 입력값을 max와 min에 넣어준다
        a = sc.nextInt();
        // 두번째 수를 a에 입력받는다
        b = sc.nextInt();
        // 세번째 수를 b에 입력받는다.
        c = sc.nextInt();
        // a 와 b를 비교해서 큰 수는 max
        // 작은 수는 min
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        // c가 max보다 크면 c-> max
        if (c > max) {
            max = c;
        }
        // c 가 min 보다 작으면 c-> min
        if (c < min) {
            min = c;
        }
        System.out.println("Max : " + max );
        System.out.println("Min : " + min);
    }
}
