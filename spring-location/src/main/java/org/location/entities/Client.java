package org.location.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClient;
	@NotEmpty
	private String nomC;
	@Email
	private String email;
	private String tel;
	
	@OneToMany(mappedBy="client")
	private Collection<Contrat> contrats;
	
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNomC() {
		return nomC;
	}
	public void setNomC(String nomC) {
		this.nomC = nomC;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Collection<Contrat> getContrats() {
		return contrats;
	}
	public void setContrats(Collection<Contrat> contrats) {
		this.contrats = contrats;
	}
	public Client(String nomC, String email, String tel, Collection<Contrat> contrats) {
		super();
		this.nomC = nomC;
		this.email = email;
		this.tel = tel;
		this.contrats = contrats;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//nice

}
