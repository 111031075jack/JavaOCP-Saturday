package day4.movie;

// 電影基本資料
public class Movie {
	private String title; // 片名
	private String duration; // 片長
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public Movie(String title, String duration) {
		this.title = title;
		this.duration = duration;
	}
	
	
	
}
