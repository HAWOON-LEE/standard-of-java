package 객체지향프로그래밍;

class Data { int x; }

public class Ex6_6 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x =10;
        System.out.println("main() : x = "+d.x);

        change(d.x);
        System.out.println("After chage(d.x)");
        System.out.println("main() : x = "+d.x);
    }

    static void change(int x) {  // 기본형 매개변수
        x = 1000;
        System.out.println("change() : x = "+x);
    }
}
