package main.java.movie.common.file.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	String color;
	String director_name;
	Integer num_critic_for_reviews;
	Integer duration;
	Integer actor_3_facebook_likes;
	String actor_2_name;
	Integer actor_1_facebook_likes;
	Integer gross;
	String actor_1_name;
	String movie_title;
	Integer num_voted_users;
	Integer cast_total_facebook_likes;
	Integer actor_3_name;
	Integer facenumber_in_poster;
	String plot_keywords;
	String movie_imdb_link;
	Integer num_user_for_reviews;
	String language;
	String country;
	String content_rating;
	Long budget; 
	Integer title_year;
	Integer actor_2_facebook_likes;
	Double imdb_score;
	Double aspect_ratio;
	Integer movie_facebook_likes;
	String genres1;
	String genres2;
	String genres3;
	String genres4;
	String genres5;
	String genres6;
	String genres7;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDirector_name() {
		return director_name;
	}
	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}
	public Integer getNum_critic_for_reviews() {
		return num_critic_for_reviews;
	}
	public void setNum_critic_for_reviews(Integer num_critic_for_reviews) {
		this.num_critic_for_reviews = num_critic_for_reviews;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Integer getActor_3_facebook_likes() {
		return actor_3_facebook_likes;
	}
	public void setActor_3_facebook_likes(Integer actor_3_facebook_likes) {
		this.actor_3_facebook_likes = actor_3_facebook_likes;
	}
	public String getActor_2_name() {
		return actor_2_name;
	}
	public void setActor_2_name(String actor_2_name) {
		this.actor_2_name = actor_2_name;
	}
	public Integer getActor_1_facebook_likes() {
		return actor_1_facebook_likes;
	}
	public void setActor_1_facebook_likes(Integer actor_1_facebook_likes) {
		this.actor_1_facebook_likes = actor_1_facebook_likes;
	}
	public Integer getGross() {
		return gross;
	}
	public void setGross(Integer gross) {
		this.gross = gross;
	}
	public String getActor_1_name() {
		return actor_1_name;
	}
	public void setActor_1_name(String actor_1_name) {
		this.actor_1_name = actor_1_name;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public Integer getNum_voted_users() {
		return num_voted_users;
	}
	public void setNum_voted_users(Integer num_voted_users) {
		this.num_voted_users = num_voted_users;
	}
	public Integer getCast_total_facebook_likes() {
		return cast_total_facebook_likes;
	}
	public void setCast_total_facebook_likes(Integer cast_total_facebook_likes) {
		this.cast_total_facebook_likes = cast_total_facebook_likes;
	}
	public Integer getActor_3_name() {
		return actor_3_name;
	}
	public void setActor_3_name(Integer actor_3_name) {
		this.actor_3_name = actor_3_name;
	}
	public Integer getFacenumber_in_poster() {
		return facenumber_in_poster;
	}
	public void setFacenumber_in_poster(Integer facenumber_in_poster) {
		this.facenumber_in_poster = facenumber_in_poster;
	}
	public String getPlot_keywords() {
		return plot_keywords;
	}
	public void setPlot_keywords(String plot_keywords) {
		this.plot_keywords = plot_keywords;
	}
	public String getMovie_imdb_link() {
		return movie_imdb_link;
	}
	public void setMovie_imdb_link(String movie_imdb_link) {
		this.movie_imdb_link = movie_imdb_link;
	}
	public Integer getNum_user_for_reviews() {
		return num_user_for_reviews;
	}
	public void setNum_user_for_reviews(Integer num_user_for_reviews) {
		this.num_user_for_reviews = num_user_for_reviews;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getContent_rating() {
		return content_rating;
	}
	public void setContent_rating(String content_rating) {
		this.content_rating = content_rating;
	}
	public Long getBudget() {
		return budget;
	}
	public void setBudget(Long budget) {
		this.budget = budget;
	}
	public Integer getTitle_year() {
		return title_year;
	}
	public void setTitle_year(Integer title_year) {
		this.title_year = title_year;
	}
	public Integer getActor_2_facebook_likes() {
		return actor_2_facebook_likes;
	}
	public void setActor_2_facebook_likes(Integer actor_2_facebook_likes) {
		this.actor_2_facebook_likes = actor_2_facebook_likes;
	}
	public Double getImdb_score() {
		return imdb_score;
	}
	public void setImdb_score(Double imdb_score) {
		this.imdb_score = imdb_score;
	}
	public Double getAspect_ratio() {
		return aspect_ratio;
	}
	public void setAspect_ratio(Double aspect_ratio) {
		this.aspect_ratio = aspect_ratio;
	}
	public Integer getMovie_facebook_likes() {
		return movie_facebook_likes;
	}
	public void setMovie_facebook_likes(Integer movie_facebook_likes) {
		this.movie_facebook_likes = movie_facebook_likes;
	}
	public String getGenres1() {
		return genres1;
	}
	public void setGenres1(String genres1) {
		this.genres1 = genres1;
	}
	public String getGenres2() {
		return genres2;
	}
	public void setGenres2(String genres2) {
		this.genres2 = genres2;
	}
	public String getGenres3() {
		return genres3;
	}
	public void setGenres3(String genres3) {
		this.genres3 = genres3;
	}
	public String getGenres4() {
		return genres4;
	}
	public void setGenres4(String genres4) {
		this.genres4 = genres4;
	}
	public String getGenres5() {
		return genres5;
	}
	public void setGenres5(String genres5) {
		this.genres5 = genres5;
	}
	public String getGenres6() {
		return genres6;
	}
	public void setGenres6(String genres6) {
		this.genres6 = genres6;
	}
	public String getGenres7() {
		return genres7;
	}
	public void setGenres7(String genres7) {
		this.genres7 = genres7;
	}
	
	
}
