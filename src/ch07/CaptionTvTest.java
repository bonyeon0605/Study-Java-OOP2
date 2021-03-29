package ch07;

class CaptionTv extends Tv{
    boolean caption;
    void displayCation (String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCation("Hello, World");
        ctv.caption = true;
        ctv.displayCation("Hello, World!");
    }
}
