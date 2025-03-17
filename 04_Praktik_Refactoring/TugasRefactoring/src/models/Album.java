public class Album {
    private String name;
    private String coverURL;

    public Album(String name, String coverURL) {
        this.name = name;
        this.coverURL = coverURL;
    }

    public String getAlbumName() {
        return name;
    }

    public void setAlbumName(String name) {
        this.name = name;
    }

    public String getAlbumCoverURL() {
        return coverURL;
    }

    public void setAlbumCoverURL(String coverURL) {
        this.coverURL = coverURL;
    }
}