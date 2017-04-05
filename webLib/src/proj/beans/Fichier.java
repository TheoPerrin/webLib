package proj.beans;

import java.util.List;

public class Fichier {
	
	private String type;
	private String description ;
	private String nom;
	private List<Descriptif> listeDescriptif; 
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Descriptif> getDescriptif() {
		return listeDescriptif;
	}
	public void setDescriptif(List<Descriptif> descriptif) {
		this.listeDescriptif = descriptif;
	}

	public void ajouterDescriptif(Descriptif descriptif){
		this.listeDescriptif.add(descriptif);
	}
}
