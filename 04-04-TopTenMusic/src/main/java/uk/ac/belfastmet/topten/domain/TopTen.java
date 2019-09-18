package uk.ac.belfastmet.topten.domain;

public class TopTen {
	
	private String soundtrack;
	private String album;
	private String image;
	
	public TopTen() {
		super();
	}

	public TopTen(String soundtrack, String album, String image) {
		super();
		this.soundtrack = soundtrack;
		this.album = album;
		this.image = image;
	}

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
	
}



