package 객체지향프로그래밍2;

class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    boolean getisPowerOn() {
        return this.isPowerOn;
    }

    void setisPowerOn() {
        isPowerOn = !isPowerOn;
    }

    int getChannel() {
        return this.channel;
    }

    void setChannel(int channel) {
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) {    // 매개변수가 있는 메소드는 반드시 작업 전에 넘겨받은 값의 유효성 검사를 해야한다.
            return;
        }
        this.channel=channel;
    }

    int getVolume() {
        return this.volume;
    }

    void setVolume(int volume) {
        if(volume > MAX_VOLUME || volume < MIN_VOLUME) {
            return;
        }
        this.volume=volume;
    }
}

public class Exercise7_4 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());
    }
}
