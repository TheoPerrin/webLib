package proj.beans;

public class Photo extends Fichier{
	private int id;
	private String nom; 
	private String auteur;
	
	
	public Photo(){
		
	}
	
	public Photo(int id, String nom, String auteur) {
		super();
		this.id = id;
		this.nom = nom;
		this.auteur = auteur;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	

}
