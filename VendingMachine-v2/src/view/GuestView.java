package view;

import service.GuestService;

import java.util.Scanner;

public class GuestView {
    private GuestService guestService = new GuestService();
    Scanner sc = new Scanner(System.in);
    public void GuestScreen() {
//        System.out.println("돈을 넣어주세요");
//        System.out.println("1: 5,000원 2: 1,000원, 3: 500원, 4: 500원");
        guestService.inputCoin();
    }
}
