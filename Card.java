import java.time.*;

public class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public static void main(String[] args) {
        Card card = new Card();
        System.out.println(card.kind);

        ZoneId a = ZoneId.of("Asia/Seoul");
        System.out.println(a);
    }
}