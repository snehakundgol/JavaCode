package com.xworkz.movie.dto;

import java.util.Objects;

public class MovieDto {
	
	 private String title;
	    private String director;
	    private String producer;
	    private String leadActor;
	    private String leadActress;
	    private String genre;
	    private String language;
	    private int releaseYear;
	    private double duration; 
	    private double budget; 
	    private double boxOfficeCollection; 
	    private double imdbRating; 
	    private String productionCompany;
	    private String certificate; 
	    private String country;
		public MovieDto(String title, String director, String producer, String leadActor, String leadActress,
				String genre, String language, int releaseYear, double duration, double budget,
				double boxOfficeCollection, double imdbRating, String productionCompany, String certificate,
				String country) {
			super();
			this.title = title;
			this.director = director;
			this.producer = producer;
			this.leadActor = leadActor;
			this.leadActress = leadActress;
			this.genre = genre;
			this.language = language;
			this.releaseYear = releaseYear;
			this.duration = duration;
			this.budget = budget;
			this.boxOfficeCollection = boxOfficeCollection;
			this.imdbRating = imdbRating;
			this.productionCompany = productionCompany;
			this.certificate = certificate;
			this.country = country;
		}
		public MovieDto() {
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public String getProducer() {
			return producer;
		}
		public void setProducer(String producer) {
			this.producer = producer;
		}
		public String getLeadActor() {
			return leadActor;
		}
		public void setLeadActor(String leadActor) {
			this.leadActor = leadActor;
		}
		public String getLeadActress() {
			return leadActress;
		}
		public void setLeadActress(String leadActress) {
			this.leadActress = leadActress;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public int getReleaseYear() {
			return releaseYear;
		}
		public void setReleaseYear(int releaseYear) {
			this.releaseYear = releaseYear;
		}
		public double getDuration() {
			return duration;
		}
		public void setDuration(double duration) {
			this.duration = duration;
		}
		public double getBudget() {
			return budget;
		}
		public void setBudget(double budget) {
			this.budget = budget;
		}
		public double getBoxOfficeCollection() {
			return boxOfficeCollection;
		}
		public void setBoxOfficeCollection(double boxOfficeCollection) {
			this.boxOfficeCollection = boxOfficeCollection;
		}
		public double getImdbRating() {
			return imdbRating;
		}
		public void setImdbRating(double imdbRating) {
			this.imdbRating = imdbRating;
		}
		public String getProductionCompany() {
			return productionCompany;
		}
		public void setProductionCompany(String productionCompany) {
			this.productionCompany = productionCompany;
		}
		public String getCertificate() {
			return certificate;
		}
		public void setCertificate(String certificate) {
			this.certificate = certificate;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		@Override
		public int hashCode() {
			return Objects.hash(boxOfficeCollection, budget, certificate, country, director, duration, genre,
					imdbRating, language, leadActor, leadActress, producer, productionCompany, releaseYear, title);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MovieDto other = (MovieDto) obj;
			return Double.doubleToLongBits(boxOfficeCollection) == Double.doubleToLongBits(other.boxOfficeCollection)
					&& Double.doubleToLongBits(budget) == Double.doubleToLongBits(other.budget)
					&& Objects.equals(certificate, other.certificate) && Objects.equals(country, other.country)
					&& Objects.equals(director, other.director)
					&& Double.doubleToLongBits(duration) == Double.doubleToLongBits(other.duration)
					&& Objects.equals(genre, other.genre)
					&& Double.doubleToLongBits(imdbRating) == Double.doubleToLongBits(other.imdbRating)
					&& Objects.equals(language, other.language) && Objects.equals(leadActor, other.leadActor)
					&& Objects.equals(leadActress, other.leadActress) && Objects.equals(producer, other.producer)
					&& Objects.equals(productionCompany, other.productionCompany) && releaseYear == other.releaseYear
					&& Objects.equals(title, other.title);
		}
		@Override
		public String toString() {
			return "MovieDto [title=" + title + ", director=" + director + ", producer=" + producer + ", leadActor="
					+ leadActor + ", leadActress=" + leadActress + ", genre=" + genre + ", language=" + language
					+ ", releaseYear=" + releaseYear + ", duration=" + duration + ", budget=" + budget
					+ ", boxOfficeCollection=" + boxOfficeCollection + ", imdbRating=" + imdbRating
					+ ", productionCompany=" + productionCompany + ", certificate=" + certificate + ", country="
					+ country + "]";
		}

	    
}
