package br.com.segchamada.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.segchamada.model.Student;

@Stateless
public class StudentService {
	
    @PersistenceContext
    private EntityManager em;

    public void persist(Student student) {
        em.persist(student);
    }
 
    public void remove(Student student) {
        em.remove(student);
    }
    
    public Student edit(Student student) {
        return em.merge(student);
    }
    
    public Student findWithId(long id) {
        return em.find(Student.class, id);
    }
    
    public List<Student> findAll() {
        return em.createQuery("select s from Student s order by s.name", Student.class).getResultList();
    }

}