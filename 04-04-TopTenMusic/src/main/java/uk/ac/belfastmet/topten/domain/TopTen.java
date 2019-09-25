package uk.ac.belfastmet.topten.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TopTen {
	
	private String soundtrack;
	private String album;
	private String image;
	private long id;
	
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
	@Column(name = "soundtrack")
	public String getSoundtrack() {
		return soundtrack;
	}

	public void setSoundtrack(String soundtrack) {
		this.soundtrack = soundtrack;
	}
	@Column(name = "album")
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	@Column(name = "image")
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public String toString() {
		return soundtrack + "" + album;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}



