package view;

import service.AdminService;

import java.util.Scanner;

public class AdminView {
    private AdminService adminService = new AdminService();

    private Scanner sc = new Scanner(System.in);
    public void adminScreen() {
        while (true) {
            System.out.println("관리자 화면");
            System.out.println("1. 메뉴 등록 2. 메뉴 삭제 3. 메뉴 수정 4. 재고 등록 5. 전체목록보기 6. 이전");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("자판기 메뉴 등록");
                    System.out.println("제품 이름을 입력하세요");
                    String menu = sc.next();
                    System.out.println("제품의 가격?(숫자만 입력)");
                    int price = sc.nextInt();
                    System.out.println("재고 등록(채울 개수)");
                    int stock = sc.nextInt();
                    adminService.drinkInsert(menu, price, stock);
                    System.out.println("등록 되었습니다");
                    adminService.drinkList();
                    break;
                case 2:
                    adminService.drinkList();
                    System.out.println("삭제할 제품명 입력 : ");
                    String deleteMenu = sc.next();
                    adminService.drinkDelete(deleteMenu);
                    adminService.drinkList();
                    break;
                case 3:
                    adminService.drinkList();
//                    System.out.println("수정 할 제품명 입력");
//                    String drink = sc.next();
//                    System.out.println("변경할 이름으로 입력");
//                    String modDrink = sc.next();
//                    System.out.println("재고 수량?");
//                    int modstock = sc.nextInt();
                    adminService.drinkUpdate();
                    adminService.drinkList();
                    break;
                case 4:
//                    System.out.println("재고를 수정 할 제품명 입력");
                    adminService.drinkStock();
                    adminService.drinkList();
                    break;
                case 5:
                    adminService.drinkList();
                    break;
                case 6:
                    return;

            }
        }
    }
}
