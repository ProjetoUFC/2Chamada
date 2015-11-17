package br.com.segchamada.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Teacher
 *
 */
@Entity

public class Teacher extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String identification;
	
	@ManyToMany
	private List<Discipline> disciplines;
	
	@OneToOne
	private Course coordinatorCourse;
	
	@ManyToMany
	private List<Course> courses;
	

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public List<Discipline> getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(List<Discipline> disciplines) {
		this.disciplines = disciplines;
	}

	public Course getCoordinatorCourse() {
		return coordinatorCourse;
	}

	public void setCoordinatorCourse(Course coordinatorCourse) {
		this.coordinatorCourse = coordinatorCourse;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	  
}