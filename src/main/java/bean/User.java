package bean;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// DB data 変数宣言
	private int id;
	private String name;
	private String password;
	
	// Getter 宣言
	public int getId() {
		return id;
	}
	public String getLogin() {
		return name;
	}
	public String getSignUp() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
	// Setter 宣言
	public void setId (int id) {
		this.id=id;
	}
	public void setLogin (String name) {
		this.name=name;
	}
	public void setSignUp (String name) {
		this.name=name;
	}
	public void setPassword(String password) {
		this.password=password;
	}
}
