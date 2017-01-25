package com.hcsu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcsu.model.Asha;

/**
 * @author vishal.settipalli
 *
 */
@Repository
public class AshaDao {

	 @Autowired
	 private SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
		 this.sessionFactory = sf;
	 }
	
	 public List<Asha> getAllAsha() {
		  Session session = this.sessionFactory.getCurrentSession();
		  List<Asha> ashaList = session.createQuery("from Asha").list();
		  return ashaList;
	 }
	
	 public Asha getAsha(int id) {
		  Session session = this.sessionFactory.getCurrentSession();
		  Asha asha = (Asha) session.load(Asha.class, new Integer(id));
		  return asha;
	 }
	
	 public Asha addAsha(Asha asha) {
		  Session session = this.sessionFactory.getCurrentSession();
		  session.persist(asha);
		  return asha;
	 }
	
	 public void updateAsha(Asha asha) {
		  Session session = this.sessionFactory.getCurrentSession();
		  session.update(asha);
	 }
	
	 public void deleteAsha(int id) {
		  Session session = this.sessionFactory.getCurrentSession();
		  Asha a = (Asha) session.load(Asha.class, new Integer(id));
		  if (null != a) {
		   session.delete(a);
		  }
	 } 
}