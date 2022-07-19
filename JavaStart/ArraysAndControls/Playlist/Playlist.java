package JavaStart.ArraysAndControls.Playlist;

public class Playlist {
    private Song[] songsList;

    public Playlist() {
    }

    public Playlist(Song[] songsList) {
        this.songsList = songsList;
    }

    public Song[] getSongsList() {
        return songsList;
    }

    public void setSongsList(Song[] songsList) {
        this.songsList = songsList;
    }

    public static String playlistLength (Song...songs){
        int length = 0;
        for (Song song : songs) {
            length += song.getLength();
        }
        TimeConverter.timeConverter(length);
        return Integer.toString(length);
    }
}
