package io.guill.uniovi.ds.practica1.part2;

/**
 * Movie.java
 *
 * @author willy
 * @version 201709151422
 * @since 15/09/2017
 * @formatter Oviedo Computing Community
 */
public class Movie {

	private String title;
	private IMovieType category;

	/**
	 * A movie is composed by a tithe an a Category that in this case will be a
	 * an interface implementing type.
	 * 
	 * @param title of the movie.
	 * @param category of the movie.
	 */
	public Movie(String title, IMovieType category) {
		this.title = title;
		this.category = category;
	}

	/**
	 * Gets the category of the movie.
	 * 
	 * @return the category of the movie.
	 */
	public IMovieType getCategory() {
		return this.category;
	}

	/**
	 * Sets the category of the movie.
	 * 
	 * @param category of the movie.
	 */
	public void setCategory(IMovieType category) {
		this.category = category;
	}

	/**
	 * Gets the title of the movie.
	 * 
	 * @return the title of the movie.
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Given a number of days return the number of points this movie will give.
	 * 
	 * @param days to compute the points.
	 * @return the number of points this movie will give.
	 */
	public int getPoints(int days) {
		return this.category.getPoints(days);
	}

	/**
	 * Given the number of days to rent this movie this method will return the
	 * price.
	 * 
	 * @param days to be rented.
	 * @return price of rental.
	 */
	public double getPrice(int days) {
		return this.category.getPrice(days);
	}
}
