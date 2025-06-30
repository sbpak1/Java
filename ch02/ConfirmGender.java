package ch02;

import java.util.Scanner;

public class ConfirmGender {
    // 주민번호 뒷자리 첫 숫자를 입력하세요
    // 1 또는 3이면 남자
    // 2 또는 4이면 여자
    // 5 이면 외국인
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호 뒷자리 첫번째 숫자를 1~5 사이로 입력하세요");
        int num = sc.nextInt();
        String grade = "";
        if (num == 1) {
            grade = "남자";
        } else if (num == 2) {
            grade = "여자";
        } else if (num == 3) {
            grade = "남자";
        } else if (num == 4) {
            grade = "여자";
        } else if (num == 5) {
            grade = "외국인";
        }
        System.out.println("당신의 성별은 : " + grade);

        }

    }


