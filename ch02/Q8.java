package ch02;

import java.util.Scanner;

public class Q8 {
    // - 문제
    //첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
    //
    //- 입력
    //정수로 입력받은 값은 출력할 줄 수 이다.
    //출력할 줄 수를 입력받는다.
    //
    //- 출력
    //첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
    //- 예제입력
    //5
    //
    //- 예제출력
    //*
    //**
    //***
    //****
    //*****
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        for (int i = 1; i <= num; i++) {
            //System.out.println(i);
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();



        }
    }
}
