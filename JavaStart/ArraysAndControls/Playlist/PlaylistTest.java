package JavaStart.ArraysAndControls.Playlist;

public class PlaylistTest {
    public static void main(String[] args) {
        Song song1 = new Song("Ulala",4320);
        Song song2 = new Song("Master Of Buba",200);
        String playlistLength = Playlist.playlistLength(song1, song2);
    }
}
