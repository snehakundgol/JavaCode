package com.xworkz.movie.runner;

import com.xworkz.movie.dto.MovieDto;
import com.xworkz.movie.service.MovieService;

public class MovieRunner 
{
 public static void main(String[] args)
 {
	System.out.println("Main method");

     MovieDto movieDto = new MovieDto();
     movieDto.setTitle("Puneet Rajkumar");
     movieDto.setDirector("Ashwini");
     movieDto.setProducer("Emma Thomas");
     movieDto.setLeadActor("Leonardo DiCaprio");
     movieDto.setLeadActress("Marion Cotillard");
     movieDto.setGenre("Science Fiction");
     movieDto.setLanguage("English");
     movieDto.setReleaseYear(2010);
     movieDto.setDuration(2.8);
     movieDto.setBudget(160.0);
     movieDto.setBoxOfficeCollection(830.0);
     movieDto.setImdbRating(8.8);
     movieDto.setProductionCompany("Syncopy");
     movieDto.setCertificate("U/A");
     movieDto.setCountry("USA");
     
     
     System.out.println("Movie Details are: "+movieDto);
	

 }
}