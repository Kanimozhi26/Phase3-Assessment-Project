package com.example.admin;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	private int admin_id;
	private String username;
	private String password;
	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", username=" + username + ", password=" + password + "]";
	}
	
	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
