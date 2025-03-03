package com.ensah.projectIT.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class TypeElement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long IdType;
	public String titre ;
	
	public Long getIdType() {
		return IdType;
	}
	public void setIdType(Long idType) {
		IdType = idType;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public TypeElement (String titreT ) {
		
		this.titre=titreT;
	}
	public TypeElement ( ) {}

}
