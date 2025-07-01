package ch02;

import java.util.Scanner;

public class Q6 {
//    두 정수 A와 B를 차례로 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//    - 입력(intA, intB) (A > 0, B < 10)
//    - 예제 입력
//    첫 번째 값을 입력하세요 :
//    A : 7
//    두 번째 값을 입력하세요 :
//    A : 9
//   - 출력
//   첫째 줄에 A+B를 출력한다.
//   7 + 9 = 16
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 값을 입력하세요");
        int num = sc.nextInt();

        System.out.println("첫번째 값 : " + num );
        System.out.println("두번째 값을 입력하세요");
        int num2 = sc.nextInt();{

        }
        System.out.println("두번째 값 : " + num2);

        int sum = num + num2;
        System.out.println("결과 : " + num + "+" +  num2 + "="+sum);
    }

}

