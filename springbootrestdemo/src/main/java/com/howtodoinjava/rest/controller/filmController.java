package com.howtodoinjava.rest.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import film.packet.Film;
import film.packet.films;
import film_dao.filmDAO;

@RestController
@RequestMapping(path = "/films")
public class filmController {

	private filmDAO filmdao;
		    
    @GetMapping(path="/listFilms", produces = "application/json")
    public films getFilms() 
    {
        return filmDAO.getAllFilms();
    }
    
    @PostMapping(path= "/addFilm", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Film> addFilms(@RequestBody Film film) {      
    	
    	ResponseEntity<Film> responseEntity = null;
    	try {
    		filmdao.addFilm(film);
    		responseEntity = new ResponseEntity<Film>(film, HttpStatus.OK);
    	} catch (Exception e) {
			e.printStackTrace();
		}
    	return responseEntity;
    }
	
    // postgresql server db and pgadmin
	

}
