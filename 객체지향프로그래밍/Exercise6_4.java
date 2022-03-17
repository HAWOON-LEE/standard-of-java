package 객체지향프로그래밍;

public class Exercise6_4 {
    // 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
    static double getDistance(int x, int y, int x1, int y1) {
        double result = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); 
        return result; 
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}