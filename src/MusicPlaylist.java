/**
 * {@code MusicPlaylist} enhanced with secondary methods.
 */
public interface MusicPlaylist extends MusicPlaylistKernel {

    /**
     * Shuffles the order of {@code this}.
     *
     * @updates this
     * @ensure |this| = |#this|
     */
    void shuffle();

    /**
     * Removes an arbitary song from {@code this}.
     *
     * @updates this
     * @ensures |this| = |#this| - 1
     * @requires |this| > 0
     * @return the song removed
     */
    String removeAny();

    /**
     * Reports the artist value of {@code song}.
     * @param song
     *              the song of the artist reported
     * @requires song is in DOMAIN (this)
     * @ensures |this| = |#this|
     * @return the artist of the song
     */
    String artist(String song);
}
