package com.xworkz.movie.service;

import com.xworkz.movie.dto.MovieDto;
import com.xworkz.movie.service.MovieService;
import com.xworkz.movie.service.MovieServiceImplementation;

public class MovieServiceImplementation extends MovieService {
	@Override
	public String validateAndSave(MovieDto dto) {
		if (dto != null) {

			if (dto.getTitle() != null && dto.getTitle().length() > 1) {
				System.out.println("validate and save movie title");
			} else {
				System.err.println("Title is null or less than 1 char");
			}
			
			if (dto.getDirector() != null && dto.getDirector().length() > 3) {
				System.out.println("validate and save movie director");
			} else {
				System.err.println("Director name is null or less than 3 char");
			}
			
			if (dto.getProducer() != null && dto.getProducer().length() > 3) {
				System.out.println("validate and save producer");
			} else {
				System.err.println("Producer name is null or less than 3 char");
			}
			
			if (dto.getLeadActor() != null && dto.getLeadActor().length() > 3) {
				System.out.println("validate and save Lead Actor");
			} else {
				System.err.println("Lead Actor name is null or less than 3 char");
			}
			
			if (dto.getLeadActress() != null && dto.getLeadActress().length() > 3) {
				System.out.println("validate and save Lead Actress");
			} else {
				System.err.println("Lead Actress name is null or less than 3 char");
			}

			if (dto.getGenre() != null && dto.getGenre().length() > 3) {
				System.out.println("validate and save movie genre");
			} else {
				System.err.println("Genre is null or less than 3 char");
			}
			
			if (dto.getLanguage() != null && dto.getLanguage().length() > 3) {
				System.out.println("validate and save language");
			} else {
				System.err.println("Language name is null or less than 3 char");
			}
			
			if (dto.getReleaseYear() <= 0 || dto.getReleaseYear() > 2025)
				System.out.println("valid year");
			} else {
				System.err.println("Invalid year");
			}

			if (dto.getDuration() > 10) {
				System.out.println("validate and save duration");
			} else {
				System.err.println("Duration should be greater than 10 minutes");
			}
			
			if (dto.getBudget() <= 10 && dto.getBudget() >= 0) {
				System.out.println("validate and save ratings");
			} else {
				System.err.println("Invalid ratings or greater than 10 or less than 0");
			}

			if (dto.getBoxOfficeCollection() > 0) {
				System.out.println("validate and save collection");
			} else {
				System.err.println("Collection is 0");
			}

			if (dto.getImdbRating() <= 10 && dto.getImdbRating() >= 0) {
				System.out.println("validate and save ratings");
			} else {
				System.err.println("Invalid ratings or greater than 10 or less than 0");
			}
			
			if (dto.getProductionCompany() != null && dto.getProductionCompany().length() > 3) {
				System.out.println("validate and save Production Company");
			} else {
				System.err.println("Production Company name is null or less than 3 char");
			}

			if (dto.getCertificate()!= null && dto.getCertificate().length() > 3) {
				System.out.println("Certificate Available ");
			} else {
				System.err.println("Not available");
			}
			
			if (dto.getCountry() != null && dto.getCountry().length() > 3) {
				System.out.println("validate and save country");
			} else {
				System.err.println("Country name is null or less than 3 char");
			}

return "not saved";
	}
}