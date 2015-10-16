package br.com.segchamada.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.segchamada.model.User;

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
        return em.find(User.class, id);
    }
    
    @SuppressWarnings("unchecked")
	public List<User> findAll() {
    	List<User> search = em.createQuery("select s from Student s").getResultList();
//    	search.addAll(em.createQuery("select t from Teacher t").getResultList());
//    	search.addAll(em.createQuery("select a from Administrator a").getResultList());
        return search;
    }
}