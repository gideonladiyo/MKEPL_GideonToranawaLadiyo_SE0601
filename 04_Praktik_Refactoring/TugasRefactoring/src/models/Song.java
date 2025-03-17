package Assignment;

import models.Artist;
import models.album;

public class Song {
	private String id;
	private String title;
	private String releaseYear;
	private String musicFileURL;
	private Genre genre = Genre.UNDEFINED;
	private Album album;
	private Artist artist;
	
	public Song(String id, String title, String releaseYear, String musicFileURL, Album album, Artist artist) {
		this.id = id;
		this.title = title;
		this.releaseYear = releaseYear;
		this.musicFileURL = musicFileURL;
		this.album = album;
		this.artist = artist;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public void printSongInfo(){
		System.out.println("Song title: " + title);
		System.out.println("Release year: " + releaseYear);
		if (genre != genre.UNDEFINED){
			System.out.println("Genre: " + genre);
		}
	}

	public void printArtistInfo(Artist artist){
		System.out.println("Artist name: " + artist.getArtistName());
		if (artist.getArtistAlias() != null){
			System.out.println("Also known as: " + artist.getArtistAlias());
		}
	}

	public void printAlbumInfo(Album album){
		System.out.println("Album title: " + album.getAlbumName());
	}

	public void printInfo(DetailLevel detailLevel){
		printSongInfo();
		if (detailLevel.includeArtist()){
			printArtistInfo(artist);
		}
		if (detailLevel.includeAlbum()){
			printAlbumInfo(album);
		}
	}
}
