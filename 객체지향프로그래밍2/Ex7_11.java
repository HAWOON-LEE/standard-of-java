package 객체지향프로그래밍2;

public class Ex7_11 {
    public static void main(String args[]) {
        Child3 c = new Child3();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Child3");  // 오버라이딩
    }
}

class Parent3 {
    public void method2() {
        System.out.println("method2() in Paraent3");
    }
}

interface MyInterface {
    static void method1() {
        System.out.println("method1() in MyInterface");
    }

    static void method2() {
        System.out.println("method2() in MyInterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    static void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}