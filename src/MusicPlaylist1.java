
import components.map.Map.Pair;
import components.queue.Queue1L;

/**
 * {@code MusicPlayist} represented as a {@link Queue<Pair<String, String>>}
 * with implementations of primary methods.
 *
 * @convention $this.length >= 0 and [the key of $this.rep is the song title and
 *             the value of $this.rep is the artist of the song]
 * @correspondence this = Queue<Map.Pair> and Map.Pair = (String, String)
 *
 * @author Jin Yang
 */
public class MusicPlaylist1 extends MusicPlaylistSecondary {

    /**
     * Representation of {@code this}.
     */
    private Queue1L<Pair<String, String>> rep;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.rep = new Queue1L<Pair<String, String>>();
    }

    /*
     * Constructors
     */

    /**
     * No-argument constructor.
     */
    public MusicPlaylist1() {
        this.createNewRep();
    }

    @Override
    public final void add(String song, String artist) {
        Pair<String, String> add = new Pair<>(song, artist);
        this.rep.enqueue(add);

    }

    @Override
    public final Pair<String, String> remove(String song) {
        Pair<String, String> remove = new Pair<String, String>();
        for (int i = 0; i < this.rep.length(); i++) {
            Pair<String, String> x = this.rep.dequeue();
            if (!x.key().equals(song)) {
                this.rep.enqueue(x);
            } else {
                remove = x;
            }
        }
        return remove;
    }

    @Override
    public final boolean isEmpty() {
        return this.rep.length() == 0;
    }

    @Override
    public final Pair<String, String> removeAny() {
        Pair<String, String> removeAny = this.rep.dequeue();
        return removeAny;
    }

    @Override
    public final boolean contains(String song) {
        boolean contains = false;
        for (int i = 0; i < this.rep.length(); i++) {
            Pair<String, String> x = this.rep.dequeue();
            if (!x.key().equals(song)) {
                contains = true;
            }
            this.rep.enqueue(x);
        }
        return contains;
    }

    @Override
    public final int size() {
        return this.rep.length();
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public final MusicPlaylist newInstance() {
        throw new UnsupportedOperationException(
                "Unimplemented method 'newInstance'");
    }

    @Override
    public final void transferFrom(MusicPlaylist arg0) {
        throw new UnsupportedOperationException(
                "Unimplemented method 'transferFrom'");
    }
}
