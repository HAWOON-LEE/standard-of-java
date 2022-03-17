package 객체지향프로그래밍2;

class Outer4 {
    static class Inner {
        int iv = 200;
    }
}

public class Exercise7_7 {
    public static void main(String[] args) {
        Outer4.Inner inner = new Outer4.Inner();

        System.out.println(inner.iv);
    }
}
