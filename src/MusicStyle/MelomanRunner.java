package MusicStyle;

public class MelomanRunner {
    public static void main(String[ ] args) {
        MusicStyle ms = MusicStyle.CLASSIC; // инициализация
        System.out.print (ms);
        switch (ms) {
            case JAZZ:
                System.out.println(" is Jazz");
                break;
            case CLASSIC:
                System.out.println(" is Classic");
                break;
            case ROCK:
                System.out.println(" is Rock");
                break;
            case BLUES:
                System.out.println(" is Blues");
                break;
            default:
                System.out.println(" Unknown music style: " + ms);
        }
    }
}