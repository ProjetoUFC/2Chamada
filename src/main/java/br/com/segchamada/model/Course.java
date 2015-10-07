package br.com.segchamada.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Course
 *
 */
@Entity

public class Course extends DefaultEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;

	//@Column(nullable = false)
	private String name;
	
	//@Column(nullable = false)
	private String identification;
	
	public Course(){}
	
	public Course(String name, String identification, List<Teacher> teachers, Teacher coordinator,
			List<Discipline> disciplines) {
		this.name = name;
		this.identification = identification;
		this.teachers = teachers;
		this.coordinator = coordinator;
		this.disciplines = disciplines;
	}

	@ManyToMany
	private List<Teacher> teachers = new ArrayList<Teacher>();
	
	@OneToOne
	private Teacher coordinator;
	
	@ManyToMany
	private List<Discipline> disciplines = new ArrayList<Discipline>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIdentification() {
		return identification;
	}
	
	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Teacher getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(Teacher coordinator) {
		this.coordinator = coordinator;
	}

	public List<Discipline> getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(List<Discipline> disciplines) {
		this.disciplines = disciplines;
	}

}