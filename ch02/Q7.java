package ch02;

import java.util.Scanner;

public class Q7 {
    // 두 정수 A와 B를 차례로 입력받은 다음, 두 수 A와 B 사이의 모든 정수값을 더해
    // 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        // 첫번째 값과 두번째 값 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 값을 입력하세요");
        int num = sc.nextInt();
//        System.out.println(num);
        System.out.println("두 번째 값을 입력하세요");
        int num2 = sc.nextInt();
//        System.out.println(num2);
        // 두 값의 모든 정수값 구하기
        int max = 0;
        int min = 0;

        if (num > num2) {
            max = num;
            min = num2;
        } else {
            max = num2;
            min = num;
        }
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;

        }
        System.out.println(sum);


        }
    }


