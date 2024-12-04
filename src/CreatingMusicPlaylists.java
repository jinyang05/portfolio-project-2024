

import components.MusicPlaylist.MusicPlaylist;

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

    }
}
