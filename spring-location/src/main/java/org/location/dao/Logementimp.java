package org.location.dao;



import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.location.entities.Client;
import org.location.entities.Contrat;
import org.location.entities.Logement;
import org.location.entities.TypeLog;



public abstract class Logementimp implements LogementDAO {
@PersistenceContext
	private EntityManager em;
	
	
	public void ajouter_logement(Logement log,Long idTypeLog) {
		TypeLog t=em.find(TypeLog.class,idTypeLog );
		log.setTypelog(t);
		em.persist(log);
		
	}
	public void supprimer_logement(Long idlog) {
		Logement log=em.find(Logement.class,idlog);
		em.remove(log);
	}
	public void modifier_logement(Logement log) {
		em.merge(log);
	}

	public void enregistrer_Contrat(Logement log, Client c,Date d1,Date d2) {
		em.persist(c);
		Contrat cont=new Contrat();
		cont.setDateContrat(new Date());
		
		
		
		
		
	}
	
	
}
