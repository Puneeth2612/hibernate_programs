package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="instructor_detail")
public class Details
{
@Id
@Column(name="id")	
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
@Column(name="youtube_channel")
private String youtubeChanl;
@Column(name="hobby")
private String hobby;
public Details() {
	super();
	
}
public Details( String youtubeChanl, String hobby) {
	super();
	this.id = id;
	this.youtubeChanl = youtubeChanl;
	this.hobby = hobby;
}
@Override
public String toString() {
	return "Details [id=" + id + ", youtubeChanl=" + youtubeChanl + ", hobby=" + hobby + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getYoutubeChanl() {
	return youtubeChanl;
}
public void setYoutubeChanl(String youtubeChanl) {
	this.youtubeChanl = youtubeChanl;
}
public String getHobby() {
	return hobby;
}
public void setHobby(String hobby) {
	this.hobby = hobby;
}
	
	
	
	
}
