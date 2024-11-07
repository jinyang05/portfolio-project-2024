import components.map.Map;

/**
 * Layered implementations of secondary methods for {@code MusicPlaylist}.
 */
public abstract class MusicPlaylistSecondary implements MusicPlaylist {

    void shuffle() {
        Map.Pair<String, String> removed = this.removeAny();
        this.add(removed.value(), removed.key());
    };

    String artist(String song) {
        Map.Pair<String, String> removed = this.remove(song);
        String artist = removed.key();
        this.add(removed.value(), removed.key());
        return artist;
    };

    String upNext() {
        Map.Pair<String, String> removed = this.removeAny();
        String song = removed.value();
        this.add(removed.value(), removed.key());
        return song;
    };

}
