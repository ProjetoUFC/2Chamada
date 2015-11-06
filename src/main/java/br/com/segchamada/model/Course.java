package br.com.segchamada.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Course
 *
 */
@Entity

public class Course implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private int identification;
	
	@ManyToMany
	private List<Teacher> teachers;
	
	@OneToOne
	private Teacher coordinator;
	
	@ManyToMany
	private List<Discipline> disciplines;
	
	@OneToMany
	private List<Student> students;
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getIdentification() {
		return identification;
	}
	
	public void setIdentification(int identification) {
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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}