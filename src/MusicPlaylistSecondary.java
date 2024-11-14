import components.map.Map;

/**
 * Layered implementations of secondary methods for {@code MusicPlaylist}.
 */
public abstract class MusicPlaylistSecondary implements MusicPlaylist {

    @Override
    public final void shuffle() {
        Map.Pair<String, String> removed = this.removeAny();
        this.add(removed.value(), removed.key());
    };

    @Override
    public final String artist(String song) {
        Map.Pair<String, String> removed = this.remove(song);
        String artist = removed.key();
        this.add(removed.value(), removed.key());
        return artist;
    };

    @Override
    public final String upNext() {
        Map.Pair<String, String> removed = this.removeAny();
        String song = removed.value();
        this.add(removed.value(), removed.key());
        return song;
    };

    @Override
    public final String toString() {
        throw new Exception("toString() can not be implemented");
    };

    @Override
    public final boolean equals(Object musicPlaylist) {
        if (musicPlaylist == null) {
            return false;
        }

        if (musicPlaylist == this) {
            return true;
        }

        if (!(musicPlaylist instanceof MusicPlaylist)) {
            return false;
        }

        MusicPlaylist underTest = (MusicPlaylist) musicPlaylist;
        if (this.size() != underTest.size()) {
            return false;
        }

        //MusicPlaylist temp = this.newInstance();

        if (this.size() == underTest.size() && !this.isEmpty()) {
            // remove elements until empty
            while (!underTest.isEmpty()) {
                Map.Pair<String, String> removed = underTest.removeAny();
                // if the elment is also in this, remove it
                if (!this.contains(removed.value())) {
                    return false;
                }
            }
        } else if (this.isEmpty() && underTest.isEmpty()) {
            return true;
        }
        return false;
    };

    @Override
    public final int hashCode() {
        return this.size();
    }

}
