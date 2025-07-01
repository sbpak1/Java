package ch02;

import java.util.Scanner;

public class Q12 {
    //- 입력
    //처음에 입력 받는 값은 시간 : H
    //두번째 입력 받는 값은 분 : M
    //두 값의 범위는 다음과 같다. : 0 ≤ H ≤ 23, 0 ≤ M ≤ 59
    //그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분을 의미한다.
    //
    //입력 시간은 24시간 표현을 사용한다.
    //24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
    //시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
    //
    //- 출력
    //첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다.
    //(입력과 같은 형태로 출력하면 된다.)
    //
    //- 예제입력
    //10 10
    //0 30
    //23 40
    //1 20
    //
    //- 예제출력
    //9 25
    //23 45
    //22 55
    //0 35
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = 0;
        int minuit = 0;

        while (true) {
            System.out.println("알람 설정을 몇시에 맞출까요");
            hour = sc.nextInt();
            if (hour >= 0 && hour <= 23) {
                break;
            }
            System.out.println("잘못 입력 하셨습니다");
        }

        while (true) {
            System.out.println("알람 설정을 몇분에 맞출까요");
            minuit = sc.nextInt();
            if (minuit >= 0 && minuit <= 59) {
                break;
            }
        }

        // 45분을 뺀 알람 시간을 정한다
        // 1  5 - 6
        // 0 (60+40)  - 45
        System.out.println(hour + " " +  minuit);

        if ((minuit - 45) < 0) {
            minuit = (minuit + 60) - 45;
            if (hour == 0) {
                hour = 23;
            } else {
                hour = hour - 1;
            }

        } else {
            minuit = minuit - 45;
        }

        System.out.println(hour + " " +  minuit);

    }
}
