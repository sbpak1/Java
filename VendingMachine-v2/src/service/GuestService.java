package service;

import repository.VendingMachineRepository;
import vo.VendingMachine;

import java.util.Scanner;

public class GuestService {
    Scanner sc = new Scanner(System.in);
    public void inputCoin() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("돈을 넣어주세요");
            System.out.println("1: 5,000원 2: 1,000원, 3: 500원, 4: 100원");
            int num = sc.nextInt();


        }



        System.out.println("투입 금액 : ");
        System.out.println("사용가능 금액 : ");
    }
}
