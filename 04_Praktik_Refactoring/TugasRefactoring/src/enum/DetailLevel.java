public enum DetailLevel {
    SONG_ONLY(false, false),
    SONG_ARTIST(true, false),
    SONG_ALBUM(false, true),
    FULL(true, true);

    private final boolean includeArtist;
    private final boolean includeAlbum;

    DetailLevel(boolean includeArtist, boolean includeAlbum) {
        this.includeArtist = includeArtist;
        this.includeAlbum = includeAlbum;
    }

    public boolean includeArtist() {
        return includeArtist;
    }

    public boolean includeAlbum() {
        return includeAlbum;
    }
}
