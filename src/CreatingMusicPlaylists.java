import components.MusicPlaylist.MusicPlaylist;
import components.map.Map;

/**
 * Using MusicPlaylist for creating a music playlist.
 *
 * @author Jin Yang
 */
public class CreatingMusicPlaylists {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // initalizing the music playlist
        MusicPlaylist fallPlaylist = new MusicPlaylist();

        // adding songs
        fallPlaylist.add("No.1 Party Anthem", "Artic Monkeys");
        fallPlaylist.add("Messy", "Lola Young");
        fallPlaylist.add("Constellations", "Jade LeMac");
        fallPlaylist.add("So Hot You're Hurting My Feelings",
                "Caroline Polachek");
        fallPlaylist.add("F2F", "SZA");
        fallPlaylist.add("Strawberry Blond", "Mitski");

        // see what is playing next
        System.out.println("The next song played is " + fallPlaylist.upNext());
        // shuffle the order
        fallPlaylist.shuffle();
        // now see what is playing next
        System.out.println("The next song played is " + fallPlaylist.upNext());

        // check to see if a song should be added to avoid duplicates
        if (fallPlaylist.contains("Messy")) {
            System.out.println("the song is already added");
        } else {
            fallPlaylist.add("Messy", "Lola Young");
        }

        // see what is in your playlist
        while (fallPlaylist.size() > 0) {
            Map.Pair<String, String> removed = fallPlaylist.removeAny();
            System.out.println(removed.key() + " by " + removed.value());
        }

    }
}
