package ch02;

import java.util.Scanner;

public class gender {
    public static void main(String[] args) {
        // 주민번호 뒷자리 첫 숫자를 입력하세요.
        // 1 or 3 이면 : 남자
        // 2 or 4 이면 : 여자
        // 5 이면 : 외국인
        Scanner sc = new Scanner(System.in);
        // 주민번호 뒷자리 첫 숫자
        System.out.println("주민등록번호 뒷자리 첫 숫자를 입력하세요");
        int num = sc.nextInt();
        String result;
        // 비교 후 출력
        if (num == 1 || num == 3) {
            result = "남";
        } else if (num == 2 || num == 4) {
            result = "여";
        } else if (num == 5) {
            result = "외국인";
        } else {
            result = "잘못 입력했습니다.";
        }
        System.out.println(result);
    }

}