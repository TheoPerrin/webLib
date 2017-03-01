package proj.dao;

import static proj.dao.DAOFactory.initialisationRequetePreparee;
import static proj.dao.DAOUtilitaire.fermeturesSilencieuses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import proj.beans.Fichier;

public class FichierDaoImpl implements FichierDao{
	
	private DAOFactory daoFactory;
	private static final String SQL_SELECT_PAR_NOM = "SELECT * FROM Fichier WHERE Nom = ?";
	private static final String SQL_CREER_FICHIER = "INSERT INTO Fichier VALUES(?, ?, ?) ";
	private static final String SQL_EXIST_FICHIER = "SELECT * FROM Fichier WHERE Nom = ? ";
	
	/*Constructeur*/
	public FichierDaoImpl( DAOFactory daoFactory ) { 
        this.daoFactory = daoFactory;
    }
	
	@Override
	public void creer( Fichier fichier ) throws DAOException{
		
		String 	nom 	= fichier.getNom();
		String description = fichier.getDescription();
		String type = fichier.getType();
		int statut; 
		
		System.out.println(nom);
		System.out.println(description);
		System.out.println(type);

		
		
		Connection connexion = null;
    	PreparedStatement preparedStatement = null;

    	 try{
 	    	connexion = daoFactory.getConnection();
 	    	preparedStatement = DAOFactory.initialisationRequetePreparee(connexion, SQL_CREER_FICHIER, false, nom, description, type);
 	    	statut = preparedStatement.executeUpdate();
 	    	if (statut==0){System.out.println("création du fichier");};
 	    } 	catch ( SQLException e ) {
         	throw new DAOException( e );
 		  	}
 				finally {
 				fermeturesSilencieuses( preparedStatement, connexion );
 				}  
		
	}
	
	@Override
    public Fichier trouver( String nom ) throws DAOException{
    	Connection connexion = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet resultSet = null;
    	Fichier fichier = null;
    	
    	
    	try {
            /* Récupération d'une connexion depuis la Factory */
            connexion = daoFactory.getConnection();
            preparedStatement = initialisationRequetePreparee( connexion, SQL_SELECT_PAR_NOM, false, nom );
            resultSet = preparedStatement.executeQuery();
            
	            /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	            if ( resultSet.next() ) {
	               fichier = new Fichier();
	               fichier.setNom			( 	resultSet.getString  ( "Nom" )			);
	               fichier.setDescription	(	resultSet.getString  ( "Description" )	);
	               fichier.setType			(	resultSet.getString	 ( "Type" )		);
	            }
    		} catch ( SQLException e ) {
                throw new DAOException( e ); 
            } finally {
                fermeturesSilencieuses( resultSet, preparedStatement, connexion );
            }
    	
    	return fichier;
    }
    
	@Override
    public boolean existe (String nom) throws DAOException{
		boolean existe = false;
    	Connection connexion = null; 
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    
	    try {
	    	/* Récupération d'une connexion depuis la Factory */
            connexion = daoFactory.getConnection();
            preparedStatement = initialisationRequetePreparee( connexion, SQL_EXIST_FICHIER, false, nom );
            resultSet = preparedStatement.executeQuery();
	    	
	    		if ( resultSet.next() ) {
	    			existe = true;
	    		}
	  		
	    } catch ( SQLException e ) {
            throw new DAOException( e ); 
        } finally {
            fermeturesSilencieuses( resultSet, preparedStatement, connexion );
        } 
    	
    	return existe;
    }

}
