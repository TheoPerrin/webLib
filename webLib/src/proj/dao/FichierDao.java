package proj.dao;

import proj.beans.Fichier;

public interface FichierDao<T> {
	
	void creer (T t) throws DAOException; 
	
	T trouver (String nom) throws DAOException;
	
	boolean existe (String nom) throws DAOException;
	
}
