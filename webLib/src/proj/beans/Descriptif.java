package proj.beans;

public class Descriptif {
	
	
	private String nomFichier; 
	private String categorie; 
	private String valeur;
	
	public Descriptif(String nomFichier, String categorie, String valeur) {
		super();
		this.nomFichier = nomFichier;
		this.categorie = categorie;
		this.valeur = valeur;
	}
	
	public Descriptif(){
		
	}

	public String getNomFichier() {
		return nomFichier;
	}

	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	
	
	
	

}
