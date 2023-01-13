package A_뮤직플레이어;

import java.util.Scanner;

public class MusicMain {
	
	private String title;
	private String artist;
	private int playtime;
	private String detail;

	public MusicMain(String title, String artist) {
		this.title = title;
		this.artist = artist;
		
	
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	
}
