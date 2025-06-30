package ch01;

public class ExchangeMoney {
    // 2680원을 1000원, 500원, 100원, 50원, 10원
    // 각각 몇 개씩 최소로 필요한지 출력하세요
    // 금액 : 2,680원
    // 1,000원 : 2개
    // 500원 : 1개
    // 100원 : 1개
    // 50원 : 1개
    // 10원 : 3개

    public static void main(String[] args) {
        int result = 2680; // 초기금액
        System.out.println("금액 : " + result+"원");
        // 2680원
        int won1000;
        won1000 = result / 1000;
        System.out.println("1,000원 : " + won1000+"개");
        // 1000원 변수에는 2 result 값 = 680
        int na = result % 1000;
        // 680
        int won680;
        won680 = na / 500;
        System.out.println("500원 : " + won680 +"개");
        // na = 680 , na % 500
        int na2 = na % 500;
        // na2 = 180
        int won180 = na2 / 100;
        System.out.println("100원 : " + won180 +"개");
        int na3 = na2 % 100;
        int won80 = na3 / 50;
        System.out.println("50원 : " + won80 +"개");
        int na4 = na3 % 50;
        int won30 = na4 / 10;
        System.out.println("10원 : " + won30 +"개");


    }
}
