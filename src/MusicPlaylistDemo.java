import components.MusicPlaylist.MusicPlaylist;
import components.map.Map;

/**
 * Demostrating how to use MusicPlaylist.
 *
 * @author Jin Yang
 */
public class MusicPlaylistDemo {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // initalizing variables
        MusicPlaylist fallPlaylist = new MusicPlaylist();
        String addSong = "About You";
        String addArtist = "The 1975";

        // adding a song
        fallPlaylist.add(addSong, addArtist);

        //removing a song
        Map.Pair<String, String> removed = fallPlaylist.remove("About You");
        System.err.println("the song " + removed.key() + "by " + removed.value()
                + "was removed!");

        // testing isEmpty()
        if (fallPlaylist.isEmpty()) {
            System.out.println("The playlist is empty!");
        } else {
            System.out.println("The playlist is not empty! ");
        }

    }
}
