package com.one.to.many;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private String Id;
	private String title;
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="instructor_id")
	private  Instructor instructor;
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public String getTitle() {
		return title;
	}
	public Course(String title) {
		super();
		this.title = title;
		this.instructor = instructor;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
