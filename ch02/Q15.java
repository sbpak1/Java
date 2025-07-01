package ch02;

import java.util.Scanner;

public class Q15 {
//처음 프로그램이 시작되면....
//
//======================
//메뉴를 선택하세요
//======================
//1. 인사하기 2. 춤추기 3. 밥먹기  4. 종료하기
//
//각 번호를 선택하면..
//
//안녕하세요
//삐끼삐끼 춤입니다.
//맛나게 먹었습니다.
//프로그램을 종료합니다.
//
//1~3번을 선택하면 해당 메시지를 보여주고
//다시 메뉴선택화면을 보여줍니다.
//
//4번을 선택하면 메시지를 출력하고 멈춥니다./
public static void main(String[] args) {
   // 스캐너 반복문 작성
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("메뉴를 선택하세요");
        System.out.println("1. 인사하기"+" 2. 춤추기 "+" 3. 밥먹기 "+" 4. 종료하기");
        int num = sc.nextInt();
        // 번호별로 출력되는 메세지 작성
        switch (num) {
            case 1:
                System.out.println("안녕하세요");
                continue;
            case 2:
                System.out.println("삐끼삐끼 춤입니다.");
                continue;
            case 3:
                System.out.println("맛나게 먹었습니다.");
                continue;
            case 4:
                break;
        }
        break;
    }
    System.out.println("프로그램을 종료합니다");

    }

}
