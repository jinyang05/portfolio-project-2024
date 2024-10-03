import components.queue.Queue;
import components.queue.Queue1L;

/**
 * {@code MusicPlaylist} represented as {@Queue<String>} with implementations of
 * primary methods.
 *
 * @convention <pre>
 *[the key of $this.rep is the song title and the value of $this.rep is the artist of the song]
 * </pre>
 *
 * @correspondnece <pre>
 * </pre>
 *
 * @author Jin Yang
 *
 */

public class MusicPlaylist extends MusicPlaylistSecondary {

    /**
     * Representation of {@code this}.
     *
     */
    private Queue rep;

    /**
     * Creator of inital representation.
     */
    private void createNewRep() {
        this.rep = new Queue1L<String>();
    }

    /**
     * adds song to MusicPlaylist
     *
     * @param song
     */
    public final void add(String song) {
        this.rep.enqueue(song);

    }

    /*
     * removes song from this
     */
    public final String remove(String song) {
        Object remove = song;
        while (this.rep.length() > 0) {
            Object x = this.rep.dequeue();
            if (!x.equals(song)) {
                this.rep.enqueue(x);
            } else {
                remove = x;
            }
        }
        return (String) remove;

    }

    /*
     * reports if this is empty
     */
    public final boolean isEmpty() {
        boolean isEmpty = false;
        if (this.rep.length() == 0) {
            isEmpty = true;
        }
        return isEmpty;

    }

    /* main method showing the component in action */
    public static void main(String[] args) {
        // initalizing variables
        MusicPlaylist fallPlaylist = new MusicPlaylist();
        String addSong = "About You";

        // adding a song
        fallPlaylist.add(addSong);

        //removing a song
        String removed = fallPlaylist.remove("About You");
        System.err.println("the song " + removed + "was removed!");

        // testing isEmpty()
        if (fallPlaylist.isEmpty()) {
            System.out.println("The playlist is empty!");
        } else {
            System.out.println("The playlist is not empty! ");
        }

    }
}