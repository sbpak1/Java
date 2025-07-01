package ch02;

public class Q5 {
//    money 변수 3780원의 금액이 있습니다.
//    이를 다음과 같은 결과가 나오도록 출력합니다.
//    1000원 : 3개
//    남은금액 : 780원
//    500원 : 1개
//    남은금액 : 280원
//    100원 : 2개
//    남은금액 : 80원
//    10원 : 8개
//    남은금액 : 0원
    public static void main(String[] args) {
        // 초기 값
        int money = 3780;
        System.out.println("초기 금액 : " + money+"원");
        // 1000원 나눈값 / 나머지
        int A = money / 1000;
        int A2 = money % 1000;
        System.out.println("1000원 : " + A + "개");
        System.out.println("남은 금액 : " + A2 + "원");

        // 500원 나눈값 / 나머지
        int A3 = A2 / 500;
        int A4 = A2 % 500;
        System.out.println("500원 : " + A3 + "개");
        System.out.println("남은 금액 : " + A4 + "원");

        // 100원 나눈값 / 나머지
        int A5 = A4 / 100;
        int A6 = A4 % 100;
        System.out.println("100원 : " + A5 + "개");
        System.out.println("남은 금액 : " + A6 + "원");

        // 10원 나눈값 / 나머지
        int A7 = A6 / 10;
        int A8 = A6 % 10;
        System.out.println("10원 : " + A7 + "개");
        System.out.println("남은 금액 : " + A8 + "원");
    }
}
