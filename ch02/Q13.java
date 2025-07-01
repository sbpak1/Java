package ch02;

import java.util.Scanner;

public class Q13 {
    //- 입력
    //첫째 입력 값은 현재 시간,(0 ≤ A ≤ 23)
    //두번째 입력 값은 현재 분, (0 ≤ B ≤ 59)
    //세번째 입력값은 요리하는 데 필요한 시간
    //	C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
    //
    //- 출력
    //첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다.
    //(단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다.
    //디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
    //
    //- 예제입력
    //14
    //30
    //20
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = 0; //처음입력받는 시간
        int minuit = 0; //처음 입력받는 분
        int cook = 0; //요리에 필요한 시간
        int hourCook = 0; //cook / 60)의 몫을 저장할 변수
        int minCook = 0; //cook % 60)의 몫을 저장할 변수 (나머지)
        int lastHour = 0; //최종적으로 계산해서 시간을 넣을 변수
        int lastMin = 0; //최종적으로 계산해서 분을 넣을 변수

        while (true) {
            System.out.println("현재 시간");
            hour = sc.nextInt();
            if (hour >= 0 && hour <= 23) {
                break;
            }
            System.out.println("잘못 입력 하셨습니다");
        }

        while (true) {
            System.out.println("현재 분");
            minuit = sc.nextInt();
            if (minuit >= 0 && minuit <= 59) {
                break;
            }
        }
        while (true) {
            System.out.println("요리가 완성되는 시간을 분 단위로 적어주세요");
            cook = sc.nextInt();
            if (cook >= 0 && cook <= 1000) {
                break;
            }
        }

        hourCook = cook / 60;
        minCook = cook % 60;

        // 처음 입력받은 분 + (처음 입력한 시간 % 분) 값 = 60 초과 조건문
        if (minuit + minCook > 60) {
          lastHour = hour + 1;
          lastMin = (minuit + minCook) % 60;
        }else {
            lastMin = minuit + minCook;
        }
        if ((hour + hourCook) > 23) {
            lastHour = (hour + hourCook) - 24;

        }
        System.out.println(lastHour + " " +" " +  lastMin);



    }


}

