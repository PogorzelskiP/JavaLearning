package JavaStart.ArraysAndControls.Playlist;

public class TimeConverter {
    public static void timeConverter(int seconds) {
        int time = seconds % 3600;
        int hours = seconds / 3600;
        int seconds1 = time % 60;
        int minutes = time / 60;
        System.out.println(hours + ":" + minutes + ":" + seconds1);
    }
}
