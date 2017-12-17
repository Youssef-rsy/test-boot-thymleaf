package com.livre.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Columns;
@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRole;
	private String roleName;
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(long idRole, String roleName) {
		super();
		this.idRole = idRole;
		this.roleName = roleName;
	}
	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}
	public long getIdRole() {
		return idRole;
	}
	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
