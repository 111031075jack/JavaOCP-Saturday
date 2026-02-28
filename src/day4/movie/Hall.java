package day4.movie;

// 電影播放聽
public class Hall {
	
	// 物件屬性
	private Movie movie;// 要播放的電影
	private String code;// 廳代碼: A, B, C
	private String name;// 廳名稱: iMax, 3D, 2D
	
	public Hall(Movie movie, String code, String name) {
		this.movie = movie;
		this.code = code;
		this.name = name;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
