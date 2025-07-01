package ch02;

public class Q1 {
    // 1부터 10까지 수를 출력하세요 (단 숫자가 6일때는 출력하지 마세요)
    // for와 while 두 문법을 사용해서 만드세요.
    public static void main(String[] args) {
        //  for loop로 순서대로 숫자 출력
        System.out.println("===For 1~10 (6 제외)===");
        for (int i = 1; i <= 10; i++) {
            // 조건 입력
            if (i == 6) {
                continue;
            }
            System.out.println(i);


        }
        System.out.println("===While 1~10 (6 제외)===");

        // While loop로 순서대로 숫자 출력
        int num = 0;
        while (num < 10) {
            num += 1;
            // 조건 입력
            if (num == 6) {
                continue;
            }
            System.out.println(num);

        }
    }
}
