package org.demo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="abc")
public class Abc implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	private Date date;
	private String text;
	private Timestamp time;
	
	@Column(nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Abc(int id2, String text2) {
		this.id=id;
		this.text=text;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_FIELD",columnDefinition="date default sysdate",nullable=false)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(nullable=false,length =50)
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TIMESTAMP_FIELD")
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
}
