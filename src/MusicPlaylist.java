/**
 * {@code MusicPlaylist} enhanced with secondary methods.
 */
public interface MusicPlaylist extends MusicPlaylistKernel {

    /**
     * Shuffles the order of {@code this}.
     *
     * @updates this
     * @ensures |this| = |#this|
     */
    void shuffle();

    /**
     * Reports the artist value of {@code song}.
     * @param song
     *              the song of the artist reported
     * @requires song is in DOMAIN (this)
     * @ensures |this| = |#this|
     * @return the artist of the song
     */
    String artist(String song);

    /**
     * Returns the next song in the queue
     *
     * @ensures |this| = |#this|
     * @requires |this| > 0
     * @return the song that will be played next
     */
    String upNext();


}
