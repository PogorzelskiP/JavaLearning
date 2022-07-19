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

    public static int playlistLength (Song...songs){
        int length = 0;
        for(int i = 0; i < songs.length; i++){
            length += songs[i].getLength();
        }
        return length;
    }
}
