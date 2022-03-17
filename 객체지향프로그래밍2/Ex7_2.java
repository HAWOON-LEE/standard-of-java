package 객체지향프로그래밍2;

public class Ex7_2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}

class Parent {
    int x=10; /* super.x */
}

class Child extends Parent {
    int x = 20; // this.x -> 조상클래스의 멤버변수 x와 이름이 같다. 이럴 때 구분이 필요함

    void method() {
        System.out.println("x="+x);
        System.out.println("this.x="+this.x);   // 클래스의 멤버변수 x값 = 20
        System.out.println("super.x="+super.x); // 조상 클래스 Parent의 x값 = 10
    }
}