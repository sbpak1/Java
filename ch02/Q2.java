package ch02;

public class Q2 {
    // 10부터 1까지의 수를 출력하세요. (단, 숫자가 3일 때는 출력하지 마세요)
    //  for와 do~while 문 두 문법을 사용해서 만드세요.
    public static void main(String[] args) {
       // for 루프 생성
        System.out.println("===For 10~1 (3 제외)===");
        for (int i = 10; i >= 1; i--) {
            // 조건 입력 (3 제외)
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        // do while 루프 생성

        System.out.println("===While 10~1 (3 제외)===");
        // 변수 생성
        int num = 11;
        // Do 루프 생성
        do {
            num -= 1;
            // 조건 입력(3 제외)
            if (num == 3) {
                continue;

            }
            // 출력 확인
            System.out.println(num);
        } while (num > 1);



    }
}

