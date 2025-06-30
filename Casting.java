package ch01;

public class Casting {
    // 형변환
    // 다운캐스팅
    // 업캐스팅
    public static void main(String[] args) {
        int n1 = 100; // 4byte
        System.out.println(n1);
        double d1 = n1; // 묵시적 업캐스팅
        System.out.println(d1);

        long longType = 100;
        int intType = (int) longType; // 명시적 다운캐스팅
        System.out.println(intType);
    }
}
