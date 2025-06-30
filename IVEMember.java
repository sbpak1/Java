package ch01;
// 클래스 변수
class IVEMember {
    // 장원영을 표현할 수 있는
    // Properties(Member)-속성
    String name;
    int age;
    double height;

    // 메서드(Method)-행동
    void dance(){
        System.out.println("장원영이 춤춰요");
    }
}

class Jang {
    public static void main(String[] args) {
        IVEMember jang = new IVEMember(); // 인스턴스
        jang.name = "장원영";
        jang.age = 23;
        jang.dance();
        System.out.println(jang.name);
    }
}