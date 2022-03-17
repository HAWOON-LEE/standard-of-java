package 객체지향프로그래밍2;

class MyTv2 {
    private int PrevChannel;
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
        PrevChannel = this.channel;     // 현재 채널을 이전 채널 멤버변수에 저장
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

    void gotoPrevChannel() {
        setChannel(PrevChannel);    // 현재 채널을 이전 채널로 변경한다.
    }
}

public class Exercise7_5 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
