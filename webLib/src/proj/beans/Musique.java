package proj.beans;

public class Musique extends Fichier{
	private int id;
	private String auteur;
	private String album;
	private String titre;
	
	public Musique(){
		
	}
	public Musique(int id, String auteur, String album, String titre) {
		super();
		this.id = id;
		this.auteur = auteur;
		this.album = album;
		this.titre = titre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	

}
