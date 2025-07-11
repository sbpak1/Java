package view;

import java.util.Scanner;

public class VendingMachineView {
    private Scanner sc = new Scanner(System.in);


    public void viewScreen() {

        while (true) {
            // 자판기 첫 화면
            System.out.println("1. 동전 투입 2. 잔돈 반환 3. 메뉴 선택 4. 관리자 메뉴 5. 종료");
            AdminView adminView = new AdminView();
            GuestView guestView = new GuestView();

            int num = sc.nextInt();
            switch (num) {
                case 1:
                    guestView.GuestScreen();
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    adminView.adminScreen();
                    break;
                case 5:
                    return;
            }

        }

    }
}
