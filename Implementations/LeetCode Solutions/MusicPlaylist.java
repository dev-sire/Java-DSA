import java.util.LinkedList;

public class MusicPlaylist  {
    private LinkedList<String> playlist;
    
    public MusicPlaylist() {
        playlist = new LinkedList<>();
    }

    public void addSong(String song) {
        playlist.add(song);
    }

    public String getCurrentSong() {
        if(!playlist.isEmpty()){
            return playlist.getFirst();
        } else{
            return null;
        }
    }

    public void playNextSong() {
        if(!playlist.isEmpty()){
            System.out.println("Now Playing " + playlist.removeFirst()+"...");
        } else{
            System.out.println("Playlist is Empty");
        }
    }

    public boolean isEmpty() {
        return playlist.isEmpty();
    }

    public void clearPlaylist() {
        playlist.clear();
    }
    public static void main(String[] args) {
        MusicPlaylist myPlaylist = new MusicPlaylist();
        myPlaylist.addSong("Song 1");
        myPlaylist.addSong("Song 2");
        myPlaylist.addSong("Song 3");
        myPlaylist.addSong("Song 4");
        System.out.println(myPlaylist.getCurrentSong());
        myPlaylist.playNextSong();
        System.out.println(myPlaylist.isEmpty());
        myPlaylist.clearPlaylist();
        System.out.println(myPlaylist.isEmpty());
    }
}