package org.location.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;


@Entity
public class TypeLog implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTypeLog;
	@NotEmpty
	private String nomTypeLog;
	private String Description;
	@OneToMany(mappedBy="typelog")
	private Collection<Logement> Logement;
	
	public Long getIdTypeLog() {
		return idTypeLog;
	}
	public void setIdTypeLog(Long idTypeLog) {
		this.idTypeLog = idTypeLog;
	}
	public String getNomTypeLog() {
		return nomTypeLog;
	}
	public void setNomTypeLog(String nomTypeLog) {
		this.nomTypeLog = nomTypeLog;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Collection<Logement> getLogement() {
		return Logement;
	}
	public void setLogement(Collection<Logement> logement) {
		Logement = logement;
	}
	public TypeLog(String nomTypeLog, String description, Collection<org.location.entities.Logement> logement) {
		super();
		this.nomTypeLog = nomTypeLog;
		Description = description;
		Logement = logement;
	}
	public TypeLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeLog(Long idTypeLog, @NotEmpty String nomTypeLog, String description) {
		super();
		this.idTypeLog = idTypeLog;
		this.nomTypeLog = nomTypeLog;
		Description = description;
		
	}
	
	
	
	
}
