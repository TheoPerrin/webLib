package proj.beans;

import java.util.List;

public class Video extends Fichier{
	
	private int id;
	private String realisateur; 
	private List<String> acteurs; 
	
	public Video(){
		
	}

	public Video(int id, String realisateur){
		super(); 
		this.id = id; 
		this.realisateur = realisateur; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public List<String> getActeurs() {
		return acteurs;
	}

	public void setActeurs(List<String> acteurs) {
		this.acteurs = acteurs;
	}
	
	
	
	

}
