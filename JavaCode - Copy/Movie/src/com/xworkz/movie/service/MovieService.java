package com.xworkz.movie.service;

import com.xworkz.movie.dto.MovieDto;

public abstract class MovieService {
	public abstract String validateAndSave(MovieDto dto);
}
