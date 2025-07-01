package ch02;

import java.util.Scanner;

public class Q4 {
//    임의의 값 n이 주어지면
//    예를들어 n=5이면
//   1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
//    의 결과를 출력하세요.
    public static void main(String[] args) {
        // 임의의 값 N 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int N = sc.nextInt();
        System.out.println(N);
        // for 루프 작성

        int total = 0;
        for (int i = 1; i <= N; i++) {
            int A = 0;

            for (int j = 1; j <= i; j++) {
                A += j;
            }
            total += A;
        }
        System.out.println("결과 : " + total);
    }
}
