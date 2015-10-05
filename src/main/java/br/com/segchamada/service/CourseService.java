package br.com.segchamada.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import br.com.segchamada.model.Course;


@Stateless
public class CourseService {
	
    @PersistenceContext
    private EntityManager em;
    
    public void persist (Course course){
    	em.persist(course);	
    }
    
    public void remove (Course course){
    	em.remove(course);
    }
    
    public Course edit (Course course){
		return em.merge(course);	
    }
    
    public Course findWithID (long id){
    	return em.find(Course.class, id);
    }
    
    @SuppressWarnings("unchecked")
	public List<Course> findAll() {
        return em.createQuery("select u from Course u").getResultList();
    }
    
}
