package film.packet;
		import java.util.ArrayList;
		import java.util.List;
public class films {


		    private List<Film> filmlist;
		    
		    public List<Film> getfilmlist() {
		        if(filmlist == null) {
		            filmlist = new ArrayList<>();
		        }
		        return filmlist;
		    }
		 
		    public void setFilmList(List<Film> filmlist) {
		        this.filmlist	 = filmlist;
		    }
	}

