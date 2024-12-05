import components.MusicPlaylist.MusicPlaylist;
import components.MusicPlaylist.MusicPlaylist1;
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
      
        // initalizing playlist
        MusicPlaylist fallPlaylist = new MusicPlaylist1();

        // adding songs
        fallPlaylist.add("About You", "The 1975");
        fallPlaylist.add("You're My Bestfriend", "Queen");
        fallPlaylist.add("Sober", "Conan Gray");

        //checking if the song is added
        if (fallPlaylist.contains("About You")) {
            System.out.println("The playlist contains the song!");
        } else {
            System.out.println("The playlist does not contain the song!");
        }

        // determine how many songs are in the playlist
        System.out.println(
                "There are " + fallPlaylist.size() + "songs in the playlist.");

        // look up the artist of a song
        System.out.println("The song \"About You\" is by "
                + fallPlaylist.artist("About You"));

        // shuffle the songs and see what plays next
        System.out.println(
                "The song " + fallPlaylist.upNext() + "will play next!");
        fallPlaylist.shuffle();
        System.out.println("The song " + fallPlaylist.upNext()
                + "will now play next after shuffling!");

        //removing a song
        Map.Pair<String, String> removed = fallPlaylist.remove("About You");
        System.out.println("the song " + removed.key() + "by " + removed.value()
                + "was removed!");

        // remove a random song
        Map.Pair<String, String> randomRemoved = fallPlaylist.removeAny();
        System.out.println("the song " + randomRemoved.key() + "by "
                + randomRemoved.value() + "was removed!");

        // using isEmpty()
        if (fallPlaylist.isEmpty()) {
            System.out.println("The playlist is empty!");
        } else {
            System.out.println("The playlist is not empty! ");
        }

    }
}
