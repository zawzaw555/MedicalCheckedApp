package bean;

import java.io.Serializable;
import java.time.LocalDate;

public class Health implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// DB for Health 宣言
	private int id,user_id;
	private double height,weight,bmi;
	private LocalDate checkDate;
	private String memo,bodyType;
	
	// Getter
	public int getId() {
		return id;
	}
	public int getUser_id() {
		return user_id;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public double getBmi() {
		return bmi;
	}
	public LocalDate getCheckDate() {
		return checkDate;
	}
	public String getMemo() {
		return memo;
	}
	public String getBodyType() {
		return bodyType;
	}
	
	// Setter
	public void setId(int id) {
		this.id=id;
	}
	public void setUser_id(int user_id) {
		this.user_id=user_id;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public void setBmi(double bmi) {
		this.bmi=bmi;
	}
	public void setCheckDate(LocalDate checkDate) {
		this.checkDate=checkDate;
	}
	public void setMemo(String memo) {
		this.memo=memo;
	}
	public void setBodyType(String bodyType) {
		this.bodyType=bodyType;
	}

}
