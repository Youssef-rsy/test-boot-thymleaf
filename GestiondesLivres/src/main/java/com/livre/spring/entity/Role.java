package com.livre.spring.entity;

import javax.persistence.ManyToOne;

public class Role {

	private long idRole;
	private String roleName;
	@ManyToOne
	private Admin adm;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(long idRole, String roleName, Admin adm) {
		super();
		this.idRole = idRole;
		this.roleName = roleName;
		this.adm = adm;
	}
	public Role(String roleName, Admin adm) {
		super();
		this.roleName = roleName;
		this.adm = adm;
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
	public Admin getAdm() {
		return adm;
	}
	public void setAdm(Admin adm) {
		this.adm = adm;
	}
	
	
	
}
