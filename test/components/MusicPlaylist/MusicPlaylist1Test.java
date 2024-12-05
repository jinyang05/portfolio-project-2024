import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Customized JUnit test fixture for {@code MusicPlaylist1}.
 */
public class MusicPlaylist1Test {
    /**
     * test for shuffle of an empty MusicPlaylist.
     */
    @Test
    public final void testShuffleZero() {
        MusicPlaylist n = new MusicPlaylist1();
        MusicPlaylist nCopy = n;
        n.shuffle();
        assertEquals(nCopy, n);
    }

    /**
     * test for shuffle of a MusicPlaylist of two.
     */
    @Test
    public final void testShuffleTwo() {
        boolean shuffled = false;
        MusicPlaylist n = new MusicPlaylist1();
        n.add("Self Control", "Frank Ocean");
        n.add("No. 1 Party Anthem", "Artic Monkeys");
        MusicPlaylist nCopy = n;
        n.shuffle();
        if (!n.upNext().equals(nCopy.upNext())) {
            shuffled = true;
        }
        assertTrue(shuffled);
    }

    /**
     * test for shuffle of a MusicPlaylist of more than two.
     */
    @Test
    public final void testShuffleMulitple() {
        boolean shuffled = false;
        MusicPlaylist n = new MusicPlaylist1();
        n.add("Self Control", "Frank Ocean");
        n.add("No. 1 Party Anthem", "Artic Monkeys");
        n.add("Messy", "Lola Young");
        MusicPlaylist nCopy = n;
        n.shuffle();
        if (!n.upNext().equals(nCopy.upNext())) {
            shuffled = true;
        }
        assertTrue(shuffled);
    }

    /*
     * test for artist of a MusicPlaylist of just one song.
     */
    @Test
    public void testArtistOne() {
        MusicPlaylist n = new MusicPlaylist1();
        n.add("No. 1 Party Anthem", "Artic Monkeys");
        MusicPlaylist nCopy = n;
        String artist = n.artist("No. 1 Party Anthem");
        assertEquals("Artic Monkeys", artist);
        assertEquals(nCopy, n);
    }

    /*
     * test for artist of a MusicPlaylist of two songs.
     */
    @Test
    public void testArtistTwo() {
        MusicPlaylist n = new MusicPlaylist1();
        n.add("No. 1 Party Anthem", "Artic Monkeys");
        n.add("Self Control", "Frank Ocean");
        MusicPlaylist nCopy = n;
        String artist = n.artist("Self Control");
        assertEquals("Frank Ocean", artist);
        assertEquals(nCopy, n);
    }

    /*
     * test for artist of a MusicPlaylist of more than two songs.
     */
    @Test
    public void testArtistMultiple() {
        MusicPlaylist n = new MusicPlaylist1();
        n.add("Self Control", "Frank Ocean");
        n.add("No. 1 Party Anthem", "Artic Monkeys");
        n.add("Messy", "Lola Young");
        MusicPlaylist nCopy = n;
        String artist = n.artist("Self Control");
        assertEquals("Frank Ocean", artist);
        assertEquals(nCopy, n);
    }

    /**
     * test upNext for a MusicPlaylist of one song.
     */
    @Test
    public void testUpNextOne() {
        MusicPlaylist n = new MusicPlaylist1();
        n.add("Self Control", "Frank Ocean");
        MusicPlaylist nCopy = n;
        String song = n.upNext();
        assertEquals("Self Control", song);
        assertEquals(nCopy, n);
    }

    /**
     * test upNext for a MusicPlaylist of two songs.
     */
    @Test
    public void testUpNextTwo() {
        MusicPlaylist n = new MusicPlaylist1();
        n.add("Self Control", "Frank Ocean");
        n.add("No. 1 Party Anthem", "Artic Monkeys");
        MusicPlaylist nCopy = n;
        String song = n.upNext();
        assertEquals("Self Control", song);
        assertEquals(nCopy, n);
    }

    /**
     * test upNext for a MusicPlaylist of more than two songs.
     */
    @Test
    public void testUpNextMultiple() {
        MusicPlaylist n = new MusicPlaylist1();
        n.add("Self Control", "Frank Ocean");
        n.add("No. 1 Party Anthem", "Artic Monkeys");
        n.add("Messy", "Lola Young");
        MusicPlaylist nCopy = n;
        String song = n.upNext();
        assertEquals("Self Control", song);
        assertEquals(nCopy, n);
    }
}
