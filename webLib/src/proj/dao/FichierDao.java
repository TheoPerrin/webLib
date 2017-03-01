package proj.dao;

import proj.beans.Fichier;

public interface FichierDao {
	
	void creer (Fichier fichier) throws DAOException; 
	
	Fichier trouver (String nom) throws DAOException;
	
	boolean existe (String nom) throws DAOException;
	
}
