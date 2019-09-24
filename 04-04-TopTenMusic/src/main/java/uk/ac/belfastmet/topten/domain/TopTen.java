package uk.ac.belfastmet.topten.domain;

public class TopTen {
	
	private String soundtrack;
	private String album;
	private String image;
	
	//Creates constructor for top ten
	public TopTen() {
		super();
	}

	public TopTen(String soundtrack, String album, String image) {
		super();
		this.soundtrack = soundtrack;
		this.album = album;
		this.image = image;
	}

	//Creates getters and setters for top ten variables
	public String getSoundtrack() {
		return soundtrack;
	}

	public void setSoundtrack(String soundtrack) {
		this.soundtrack = soundtrack;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public String toString() {
		return soundtrack + "" + album;
	}
	
}



