package ch01;

public class aus {
    // 2680원을 1000원, 500원, 100원, 50원, 10원
    // 각각 몇 개씩 최소로 필요한지 출력하세요
    // 금액 : 2,680원
    // 1,000원 : 2개
    // 500원 : 1개
    // 100원 : 1개
    // 50원 : 1개
    // 10원 : 3개

    public static void main(String[] args) {
        int coin = 2680;
        int restcoin = coin / 1000;
        System.out.println(restcoin);


    }
}
