package br.com.segchamada.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.segchamada.model.*;

@Stateless
public class UserService {
	
    @PersistenceContext
    private EntityManager em;

    public void persist(User user) {
        em.persist(user);
    }
 
    public void remove(User user) {
        em.remove(user);
    }
    
    public User edit(User user) {
        return em.merge(user);
    }
    
    public User findWithId(long id) {
        return em.find(Student.class, id);
    }
    
    public List<Student> findAll() {
    	List<Student> search = em.createQuery("select s from Student s order by s.name", Student.class).getResultList();
//    	search.addAll(em.createQuery("select t from Teacher t").getResultList());
//    	search.addAll(em.createQuery("select a from Administrator a").getResultList());
        return search;
    }

}