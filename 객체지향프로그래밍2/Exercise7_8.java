package 객체지향프로그래밍2;

class Outer1 {
    int value = 10;

    class Inner {
        int value = 20;
        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer1.this.value);
        }
    }   // Inner클래스의 끝
}   // Outer클래스의 끝

public class Exercise7_8 {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        Outer1.Inner inner = outer.new Inner();
        inner.method1();
    }
}
