package film_dao;
	import org.springframework.stereotype.Repository;

import film.packet.Film;
import film.packet.films;


		@Repository
		public class filmDAO 
		{
		    private static films list = new films();
		    
		    static 
		    {
		        list.getfilmlist().add(new Film("01", "Fight club", "Brad"));
		        list.getfilmlist().add(new Film("2", "Aliens", "Naore"));
		        list.getfilmlist().add(new Film("3", "David", "Kameron"));
		    }
		    
		    public static films getAllFilms() 
		    {
		        return list;
		    }
		    
		    public void addFilm(Film Film) {
		        list.getfilmlist().add(Film);
		    }
		}


