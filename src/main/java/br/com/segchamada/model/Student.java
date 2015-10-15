package br.com.segchamada.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity

public class Student extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private Integer matriculation;
	
	@ManyToMany
	private List<Discipline> disciplines;
	
	@ManyToOne
	private Course course;

	public Student() {}

	public Student(String name, String login, String password, String email, Integer matriculation, List<Discipline> disciplines, Course course) {
		super(name, login, password, email);
		this.matriculation = matriculation;
		this.disciplines = disciplines;
		this.course = course;
	}

	public Integer getMatriculation() {
		return matriculation;
	}

	public void setMatriculation(Integer matriculation) {
		this.matriculation = matriculation;
	}

	public List<Discipline> getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(List<Discipline> disciplines) {
		this.disciplines = disciplines;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}