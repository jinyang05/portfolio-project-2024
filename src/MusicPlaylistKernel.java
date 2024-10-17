import components.standard.Standard;

/**
 * Music Playlist component with primary methods.
 *
 */
public interface MusicPlaylistKernel extends Standard<MusicPlaylist> {
    /**
     * Adds {@code (song, artist)} to {@code this}.
     *
     * @param song
     *            the {@code song} to be added
     * @param artist
     *            the {@code artist} to be added
     * @updates this
     * @ensures |this| = |#this| + 1
     */
    void add(String song, String artist);

    /**
     * Removes {@code song} from {@code this} and reports the song.
     *
     * @param song
     *            the {@code song} to be removed
     * @updates this
     * @ensures |this| = |#this| - 1
     * @requires |this| > 0 and song is in DOMAIN (this)
     * @return the song removed
     */
    String remove(String song);

    /**
     * Reports whether {@code this} is empty.
     *
     * @ensures isEmpty = (|this| = 0)
     * @return true iff {@code this} is empty
     */
    boolean isEmpty();
}