package vo;

public class VendingMachine {
    // 동전투입
    // 잔돈반환
    // 메뉴선택
    // 관리자메뉴
    private int coin;
    private int price;
    private String menu;
    private int stock;

    public VendingMachine() {
    }

    // Getter

    public int getCoin() {
        return coin;
    }

    public int getPrice() {
        return price;
    }

    public String getMenu() {
        return menu;
    }

    public int getStock() {
        return stock;
    }

    // Setter

    public void setCoin(int num) {
        this.coin = coin;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "제품명 : " + menu +
                " / 가격 : " + price +
                " / 재고 개수 : " + stock;
    }
}
