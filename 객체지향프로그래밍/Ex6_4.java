package 객체지향프로그래밍;

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.substract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L); // long값으로 호출해도 double로 자동형변환 된다.

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

class MyMath {
    long add(long a, long b) {
        long result = a+b;
        return result;
        // return a+b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
    }
    long substract(long a, long b) {return a - b;}
    long multiply(long a, long b) {return a * b;}
    double divide(double a, double b) {return a / b;}
}