package 객체지향프로그래밍;

public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = "+Card.width);
        System.out.println("Card.height = "+Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 "+c1.kind+", "+c1.number+" 이며, 크기는 ("+c1.width+", "+c1.height+")0");
        System.out.println("c2은 "+c2.kind+", "+c2.number+" 이며, 크기는 ("+c2.width+", "+c2.height+")0");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 "+c1.kind+", "+c1.number+" 이며, 크기는 ("+c1.width+", "+c1.height+")0");
        System.out.println("c2은 "+c2.kind+", "+c2.number+" 이며, 크기는 ("+c2.width+", "+c2.height+")0");
    }
}

class Card {
    String kind;               // 인스턴스 변수 (인스턴스마다 각기 다른 값을 유지해야할 때)
    int number;                
    static int width = 100;    // 클래스 변수 (모든 인스턴스가 하나의 저장공간 공유, 항상 공통된 값을 가져야할 때)
    static int height = 250;
}
