package 객체지향프로그래밍;

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x=x;
        this.y=y;
    }
    double getDistance(int x1, int y1) {
        double result = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
        return result;
    }
}

public class Exercise6_6 {
    public static void main(String[] args) {
        MyPoint p =new MyPoint(1, 1);

        // p와 (2, 2)의 거리를 구한다.
        System.out.println(p.getDistance(2,2));
    }
}
