package ch02;

import java.util.Scanner;

public class ConfirmGender2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 주민번호 뒷자리 첫 숫자
        System.out.println("주민등록번호 뒷자리 첫 숫자를 입력하세요");
        int num = sc.nextInt();
        String result;
        // 비교 후 출력
        if (num < 1 || num > 5) {
            result = "잘못 입력 하셨습니다";
        } else if (num == 5)
        {
            result = "외국인";
        } else if ((num % 2) == 1 ) {
            result = "남자";
        } else {
            result = "여자";
        }
        System.out.println(result);

    }
}
