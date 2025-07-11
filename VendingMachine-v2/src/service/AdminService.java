package service;

import repository.VendingMachineRepository;

import view.VendingMachineView;
import vo.VendingMachine;

import java.util.Scanner;

public class AdminService {
//    private AdminView adminView = new AdminView();
    Scanner sc = new Scanner(System.in);

    // 메뉴 등록
    public void drinkInsert(String menu, int price, int stock) {
//        System.out.println("자판기 메뉴 등록");
//        System.out.println("제품 이름을 입력하세요");
//        menu = sc.next();
//        System.out.println("제품의 가격?(숫자만 입력)");
//        int Price = sc.nextInt();
//        System.out.println("재고 등록(채울 개수)");
//        stock = sc.nextInt();
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setMenu(menu);
        vendingMachine.setPrice(price);
        vendingMachine.setStock(stock);
        VendingMachineRepository.vendingMachineList.add(vendingMachine);

    }

    // 메뉴 삭제
    public void drinkDelete(String deleteDrink) {

        int findDrink = findBydrink(deleteDrink);

        if (findDrink == -1) {
            System.out.println("삭제할 수 없습니다");
        } else {
            VendingMachineRepository.vendingMachineList.remove(findDrink);
            System.out.println("삭제 되었습니다");
        }

    }

    // 메뉴 수정
    public void drinkUpdate() {
        System.out.println("수정 할 제품명 입력");
        String drink = sc.next();
        int drinkIndex = -1;
        for (int i = 0; i < VendingMachineRepository.vendingMachineList.size(); i++) {
            if (VendingMachineRepository.vendingMachineList.get(i).getMenu().equals(drink)) {
                drinkIndex = i;
                break;
            }
        }
        if (drinkIndex == -1) {
            System.out.println("없는 제품 입니다.");
            return;
        } else {

            System.out.println("수정할 이름");
            String newDrink = sc.next();
            System.out.println("재고 수량?");
            int newStock = sc.nextInt();
            VendingMachine updateDrink = new VendingMachine();
            updateDrink.setMenu(newDrink);
            updateDrink.setStock(newStock);
            VendingMachineRepository.vendingMachineList.set(drinkIndex, updateDrink);
        }


    }

    // 재고 등록
    public void drinkStock() {
        System.out.println("재고를 수정 할 제품명 입력");
        String drink = sc.next();
        int drinkIndex = -1;
        for (int i = 0; i < VendingMachineRepository.vendingMachineList.size(); i++) {
            if (VendingMachineRepository.vendingMachineList.get(i).getMenu().equals(drink)) {
                drinkIndex = i;
                break;
            }
        }
        if (drinkIndex == -1) {
            System.out.println("없는 제품 입니다.");
            return;
        } else {

            System.out.println("재고 수량?");
            int newStock = sc.nextInt();
            VendingMachine updateDrink = new VendingMachine();
            updateDrink.setMenu(drink);
            updateDrink.setStock(newStock);
            VendingMachineRepository.vendingMachineList.set(drinkIndex, updateDrink);
        }


    }

    // 전체목록보기
    public void drinkList() {
        System.out.println("=============메뉴=============");
        if (VendingMachineRepository.vendingMachineList.isEmpty()) {
            System.out.println("음료가 없습니다.");
        } else {
            for (VendingMachine drink : VendingMachineRepository.vendingMachineList) {
                System.out.println(drink.toString());
            }
        }
        System.out.println("============================");
    }

    // 홈으로 돌아가기
    public void vendingHome() {

    }

    private int findBydrink(String menu) {
        int findDrink = -1;
        for (int i = 0; i < VendingMachineRepository.vendingMachineList.size(); i++) {
            if (VendingMachineRepository.vendingMachineList.get(i).getMenu().equals(menu))
               findDrink = i;
            return findDrink;
        }
        return findDrink;
    }

}
