package hibernate.Example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Developer {

	@Id
	private int psid;
	private String name;
	private String role;
	
	public int getPsid() {
		return psid;
	}
	public void setPsid(int psid) {
		this.psid = psid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Developer [psid=" + psid + ", name=" + name + ", role=" + role + "]";
	}
	
	
}
