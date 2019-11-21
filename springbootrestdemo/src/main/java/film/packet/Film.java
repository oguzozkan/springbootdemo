package film.packet;



public class Film {
	   
	private String id;
	private String name;
	private String actor;
	private String releaseDate;
	  
	
	public Film(String id, String name, String actor, String releaseDate) {
	 
	    	this.name = name;
	    	this.setId(id);
	    	this.actor = actor;
	    	this.releaseDate = releaseDate;
	    	
	    	
	    }
	 

	public Film() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Film(String name, String actor, String releaseDate) {
		this.name = name;
		this.actor = actor;
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Film [name=" + name + ", actor=" + actor + ", releaseDate=" + releaseDate + "]";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	
}
