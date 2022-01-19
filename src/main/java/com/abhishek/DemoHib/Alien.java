package com.abhishek.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity(name = "alien_table")  //can change table name using @Table(name = <table_name>)
@Entity
public class Alien {	//POJO

	@Id
	private int aid;  //@Transient will not store that field
	//private String name;
	
	private AlienName an;
	
	//@Column(name="alien_color")
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public AlienName getAn() {
		return an;
	}
	public void setAn(AlienName an) {
		this.an = an;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", an=" + an + ", color=" + color + "]";
	}
	
}
