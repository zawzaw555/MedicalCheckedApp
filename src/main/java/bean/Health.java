package bean;

import java.io.Serializable;
import java.time.LocalDate;

public class Health implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// DB for Health 宣言
	private int height;
	private int weight;
	private int upperPressure;
	private int lowerPressure;
	private LocalDate checkDate;
	private String memo;
	
	// Getter
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public int getUpperPressure() {
		return upperPressure;
	}
	public int getLowerPressure() {
		return lowerPressure;
	}
	public LocalDate getCheckDate() {
		return checkDate;
	}
	public String getMemo() {
		return memo;
	}
	
	// Setter
	public void setHeight(int height) {
		this.height=height;
	}
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public void setUpperPressure(int upperPressure) {
		this.upperPressure=upperPressure;
	}
	public void setLowerPressure(int lowerPressure) {
		this.lowerPressure=lowerPressure;
	}
	public void setCheckDate(LocalDate checkDate) {
		this.checkDate=checkDate;
	}
	public void setMemo(String memo) {
		this.memo=memo;
	}

}
