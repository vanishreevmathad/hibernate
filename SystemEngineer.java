package com.deloitte.emp.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.DiscriminatorValue;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

@Entity
class SystemEngineer extends Employee  {
	
	    
		public String getLang() {
		return lang;
	}
	
	    public void setLang(String lang) {
		this.lang = lang;
	}
	
	    public String getDevProfile() {
		return devProfile;
	}
	
	    public void setDevProfile(String devProfile) {
		this.devProfile = devProfile;
	}
    
		
	    public SystemEngineer(String lang, String devProfile) {
		super();
		this.lang = lang;
		this.devProfile = devProfile;
	}
		public SystemEngineer() {
			// TODO Auto-generated constructor stub
		}
		private String lang;
    
		private String devProfile;
	@Override
	
	public String toString() {
		return "SystemEngineer [lang=" + lang + ", devProfile=" + devProfile + "]";
	}

}
