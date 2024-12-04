package components.MusicPlaylist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import components.map.Map;

/**
 * JUnit tests for {@code MusicPlaylist}'s kernel methods.
 *
 * @author Jin Yang
 */

public abstract class MusicPlaylistTest {

    /**
     * test adding an empty song and artist.
     */
    @Test
    public final void testAddEmpty() {
        MusicPlaylist n = new MusicPlaylist();
        n.add(" ", " ");
        assertEquals(1, n.size());
    }

    /**
     * test adding just a song.
     */
    @Test
    public final void testAddSong() {
        MusicPlaylist n = new MusicPlaylist();
        n.add("Self Control", " ");
        assertEquals(1, n.size());
    }

    /**
     * test adding just artist.
     */
    @Test
    public final void testAddArtist() {
        MusicPlaylist n = new MusicPlaylist();
        n.add(" ", "Frank Ocean");
        assertEquals(1, n.size());
    }

    /**
     * test adding both song and artist.
     */
    @Test
    public final void testAddSongAndArtist() {
        MusicPlaylist n = new MusicPlaylist();
        n.add("Self Control", "Frank Ocean");
        assertEquals(1, n.size());
    }

    /**
     * test removing item resulting in an empty MusicPlaylist.
     */
    @Test
    public final void testRemoveEmpty() {
        MusicPlaylist n = new MusicPlaylist();
        n.add("Self Control", "Frank Ocean");
        Map.Pair<String, String> nRemoved = n.remove("Self Control");
        String nSong = "Self Control";
        String nArtist = "Frank Ocean";
        assertEquals(nSong, nRemoved.key());
        assertEquals(nArtist, nRemoved.value());
        assertEquals(0, n.size());
    }

    /**
     * test removing item resulting with one pair left.
     */
    @Test
    public final void testRemoveOne() {
        MusicPlaylist n = new MusicPlaylist();
        n.add("Self Control", "Frank Ocean");
        n.add("No. 1 Party Anthem", "Artic Monkeys");
        Map.Pair<String, String> nRemoved = n.remove("Self Control");
        String nSong = "Self Control";
        String nArtist = "Frank Ocean";
        assertEquals(nSong, nRemoved.key());
        assertEquals(nArtist, nRemoved.value());
        assertEquals(1, n.size());

    }

    /**
     * test removing item resulting with more than one pair left.
     */
    @Test
    public final void testRemoveMultiple() {
        MusicPlaylist n = new MusicPlaylist();
        n.add("Self Control", "Frank Ocean");
        n.add("No. 1 Party Anthem", "Artic Monkeys");
        n.add("Messy", "Lola Young");
        Map.Pair<String, String> nRemoved = n.remove("Self Control");
        String nSong = "Self Control";
        String nArtist = "Frank Ocean";
        assertEquals(nSong, nRemoved.key());
        assertEquals(nArtist, nRemoved.value());
        assertEquals(1, n.size());

    }

    /**
     * test removing any resulting with an empty MusicPlaylist.
     */
    @Test
    public final void testRemoveAnyEmpty() {
        MusicPlaylist n = new MusicPlaylist();
        MusicPlaylist nTest = new MusicPlaylist();
        n.add("Self Control", "Frank Ocean");
        nTest.add("Self Control", "Frank Ocean");
        Map.Pair<String, String> nRemoved = n.removeAny();
        Map.Pair<String, String> nExpected = nTest.remove(nRemoved.key());
        assertEquals(0, n.size());
        assertEquals(nExpected, nRemoved);

    }

    /**
     * test removing any resulting with one pair left in the MusicPlaylist.
     */
    @Test
    public final void testRemoveAnyOne() {
        MusicPlaylist n = new MusicPlaylist();
        MusicPlaylist nTest = new MusicPlaylist();
        n.add("Self Control", "Frank Ocean");
        n.add("No. 1 Party Anthem", "Artic Monkeys");
        nTest.add("Self Control", "Frank Ocean");
        nTest.add("No. 1 Party Anthem", "Artic Monkeys");
        Map.Pair<String, String> nRemoved = n.removeAny();
        Map.Pair<String, String> nExpected = nTest.remove(nRemoved.key());
        assertEquals(1, n.size());
        assertEquals(nExpected, nRemoved);

    }

    /**
     * test removing any resulting with more than one pair left in the
     * MusicPlaylist.
     */
    @Test
    public final void testRemoveAnyMultiple() {
        MusicPlaylist n = new MusicPlaylist();
        MusicPlaylist nTest = new MusicPlaylist();
        n.add("Self Control", "Frank Ocean");
        n.add("No. 1 Party Anthem", "Artic Monkeys");
        n.add("Messy", "Lola Young");
        nTest.add("Self Control", "Frank Ocean");
        nTest.add("No. 1 Party Anthem", "Artic Monkeys");
        nTest.add("Messy", "Lola Young");
        Map.Pair<String, String> nRemoved = n.removeAny();
        Map.Pair<String, String> nExpected = nTest.remove(nRemoved.key());
        assertEquals(0, n.size());
        assertEquals(nExpected, nRemoved);

    }

    /**
     * test contains on an empty MusicPlaylist
     */
    @Test
    public final void testContainsEmpty() {
        MusicPlaylist n = new MusicPlaylist();
        MusicPlaylist nCopy = n;
        assertFalse(n.contains("Messy"));
        assertEquals(nCopy, n);

    }

    /**
     * test contains resulting in true.
     */
    @Test
    public final void testContainsTrue() {
        MusicPlaylist n = new MusicPlaylist();
        n.add("Self Control", "Frank Ocean");
        MusicPlaylist nCopy = n;
        assertTrue(n.contains("Self Control"));
        assertEquals(nCopy, n);
    }

    /**
     * test contains resulting in false.
     */
    @Test
    public final void testContainsFalse() {
        MusicPlaylist n = new MusicPlaylist();
        n.add("Self Control", "Frank Ocean");
        MusicPlaylist nCopy = n;
        assertFalse(n.contains("Messy"));
        assertEquals(nCopy, n);
    }

    /**
     * test size for an empty MusicPlaylist.
     */
    @Test
    public final void testSizeEmpty() {
        MusicPlaylist n = new MusicPlaylist();
        MusicPlaylist nCopy = n;
        assertEquals(0, n.size());
        assertEquals(nCopy, n);
    }

    /**
     * test size for a MusicPlaylist of one.
     */
    @Test
    public final void testSizeOne() {
        MusicPlaylist n = new MusicPlaylist();
        n.add("Self Control", "Frank Ocean");
        MusicPlaylist nCopy = n;
        assertEquals(1, n.size());
        assertEquals(nCopy, n);

    }

    /**
     * test size for a MusicPlaylist of more than one.
     */
    @Test
    public final void testSizeMultiple() {
        MusicPlaylist n = new MusicPlaylist();
        n.add("Self Control", "Frank Ocean");
        n.add("No. 1 Party Anthem", "Artic Monkeys");
        MusicPlaylist nCopy = n;
        assertEquals(2, n.size());
        assertEquals(nCopy, n);
    }

}
