package com.marsitech.entities;


import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Skill  implements Serializable {
	@Id @GeneratedValue
private long id ;
private String code;
private String label;
@ManyToOne
@JoinColumn(name="prof")
private Profil profil;

public Skill() {
	super();
	// TODO Auto-generated constructor stub
}
public Skill(String code, String label) {
	super();
	this.code = code;
	this.label = label;
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getLabel() {
	return label;
}
public void setLabel(String label) {
	this.label = label;
}



}

