package 객체지향프로그래밍2;

public class Ex7_17 {
    Object iv = new Object() { void method(){} };           // 익명 클래스
    static Object cv = new Object() { void method(){} };    // 익명 클래스

    void myMethod() {
        Object lv = new Object() { void method(){} };       // 익명 클래스
    }
}
