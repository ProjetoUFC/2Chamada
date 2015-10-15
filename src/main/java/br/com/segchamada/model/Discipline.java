package br.com.segchamada.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Discipline
 *
 */
@Entity

public class Discipline extends DefaultEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String identification;

	
	@ManyToMany
	private List<Teacher> teachers = new ArrayList<Teacher>();
	
	@ManyToMany
	private List<Student> students = new ArrayList<Student>();
	
	@ManyToMany
	private List<Course> courses = new ArrayList<Course>();
	
	@OneToMany (cascade = CascadeType.REMOVE)
	private List<Proof> proof = new ArrayList<Proof>();
	
	
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

	public List<Proof> getProofs() {
		return proof;
	}

	public void setProofs(List<Proof> proofs) {
		this.proof = proofs;
	}
   
}