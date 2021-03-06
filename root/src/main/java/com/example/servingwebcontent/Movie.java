package com.example.servingwebcontent;

public class Movie {
	private String id;
	private String type;
	private String name;
	private String releaseDate;
	private int duration;
	private String filmRating;

	public String getId () {
		return id;
	}

	public String getType () {
		return type;
	}

	public String getName () {
		return name;
	}

	public String getReleaseDate () {
		return releaseDate;
	}

	public int getDuration () {
		return duration;
	}

	public String getFilmRating () {
		return filmRating;
	}

	public Movie (String id, String type, String name, String releaseDate, int duration, String filmRating) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.releaseDate = releaseDate;
		this.duration = duration;
		this.filmRating = filmRating;
	}
}