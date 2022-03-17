package 객체지향프로그래밍2;

class Product1 {
    int price;
    int bonusPoint;

    Product1() {}   // Product1을 상속받은 Tv에서 기본 생성자를 호출했다. Tv의 기본 생성자는 = Tv() { super() }와 같으므로 조상 생성자 super()를 호출한다. 기존 코드엔 조상 클래스 Product1에 기본 생성자가 없으므로 추가해줘 문제를 해결했다.

    Product1(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv3 extends Product1 {
    Tv3() {}

    public String toString() {
        return "Tv";
    }
}

public class Exercise7_3 {
    public static void main(String[] args) {
        Tv3 t = new Tv3();
    }
}
