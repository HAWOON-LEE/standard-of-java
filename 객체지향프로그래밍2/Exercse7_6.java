package 객체지향프로그래밍2;

class Outer5 {
    class Inner {
        int iv = 100;
    }
}

public class Exercse7_6 {
    public static void main(String[] args) {
        Outer5 outer = new Outer5();
        Outer5.Inner outer2 = outer.new Inner();
        
        System.out.println(outer2.iv);
    }
}
