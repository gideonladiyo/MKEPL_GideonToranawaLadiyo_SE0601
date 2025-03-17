package models;

public class Artist {
    private String name;
    private String alias;
    private String imageURL;

    public Artist(String name, String alias, String imageURL){
        this.name = name;
        this.alias = alias;
        this.imageURL = imageURL;
    }
    
    public String getArtistName(){
        return name;
    }

    public void setArtistName(String name){
        this.name = name;
    }

    public String getArtistAlias(){
        return alias;
    }

    public void setArtistAlias(String alias){
        this.alias = alias;
    }

    public String getArtistImageURL(){
        return imageURL;
    }

    public void setArtistImageURL(String imageURL){
        this.imageURL = imageURL;
    }
}
