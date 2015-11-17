package br.com.segchamada.model;

import java.io.Serializable;
import java.lang.Long;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Discipline
 *
 */
@Entity

public class Discipline implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String identification;

	@ManyToMany
	private List<Teacher> teachers;
	
	@ManyToMany
	private List<Student> students;
	
	@ManyToMany
	private List<Course> courses;
	
	@OneToMany (cascade = CascadeType.REMOVE)
	private List<Test> tests;

	
	protected Discipline() {}
	
	public Discipline(String name, String identification) {
		this.name = name;
		this.identification = identification;
	}
	
	public Long getId() {
		return this.id;
	}
	
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

	public void seTeaches(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Student> getStudent() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<Test> getTests() {
		return tests;
	}

	public void setTests(List<Test> proofs) {
		this.tests = proofs;
	}
}