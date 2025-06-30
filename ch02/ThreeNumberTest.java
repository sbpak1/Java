package ch02;

import java.util.Scanner;

public class ThreeNumberTest {
    // 세 수를 차례로 입력받는다
    // 가장 큰 수와 가장 작은 수를 출력한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 수를 입력하세요.");
        int A = sc.nextInt();

        System.out.println("두 번째 수를 입력하세요.");
        int B = sc.nextInt();

        System.out.println("세 번째 수를 입력하세요.");
        int C = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        if (max < A) {
            max = A;
        }
        if (max < B) {
            max = B;
        }
        if (max < C) {
            max = C;
        }
        if (min > A) {
            min = A;
        }
        if (min > B) {
            min = B;
        }
        if (min > C) {
            min = C;
        }
        System.out.println("큰 값 : " + max + " 작은 값 : " + min);


    }

}