package 객체지향프로그래밍2;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for(int i=0; i<cards.length; i++) {
            int num = i%10+1;     
            // 0+1, 1+1, 2+1....9+1을 두 번 반복하게 된다
            boolean isKwang = (i<10)&&(num==1||num==3||num==8);
            // (1<10)조건은 1~10값이 나오는 두 번의 반복 중 한 번만 실행하게 하는 조건이며, &&가 ||보다 우선순위가 높기 때문에 괄호를 반드시 사용해야 한다.
            // boolean isKwang = (2 < 10)&&(3==1||3==3||3==8);
            // boolean isKwang = (true)&&(false||true||false);
            // boolean isKwang = (true)&&(true||false);
            // boolean isKwang = (true)&&(true);
            // boolean isKwang = true;
            cards[i] = new SutdaCard(num, isKwang);
        }
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info() 대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Exercse7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i=0; i< deck.cards.length; i++) {
            System.out.print(deck.cards[i]+",");
        }
    }
}
