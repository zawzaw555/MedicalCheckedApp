package bean;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// DB data 変数宣言
	private int id;
	private String login_id;
	private String name;
	private String password;
	
	// Getter 宣言
	public int getId() {
		return id;
	}
	public String getLoginId() {
		return login_id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
	// Setter 変数宣言
	public void setId(int id) {
		this.id = id;
	}
	public void setLoginId(String login_id) {
		this.login_id = login_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
