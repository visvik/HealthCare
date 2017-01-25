package com.hcsu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcsu.model.Anganwadi;

/**
 * @author vishal.settipalli
 *
 */
@Repository
public class AnganwadiDao {

	 @Autowired
	 private SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
		 this.sessionFactory = sf;
	 }
	
	 public List<Anganwadi> getAllAnganwadi() {
		  Session session = this.sessionFactory.getCurrentSession();
		  List<Anganwadi> anganwadiList = session.createQuery("from Anganwadi").list();
		  return anganwadiList;
	 }
	
	 public Anganwadi getAnganwadi(int id) {
		  Session session = this.sessionFactory.getCurrentSession();
		  Anganwadi anganwadi = (Anganwadi) session.load(Anganwadi.class, new Integer(id));
		  return anganwadi;
	 }
	
	 public Anganwadi addAnganwadi(Anganwadi anganwadi) {
		  Session session = this.sessionFactory.getCurrentSession();
		  session.persist(anganwadi);
		  return anganwadi;
	 }
	
	 public void updateAnganwadi(Anganwadi anganwadi) {
		  Session session = this.sessionFactory.getCurrentSession();
		  session.update(anganwadi);
	 }
	
	 public void deleteAnganwadi(int id) {
		  Session session = this.sessionFactory.getCurrentSession();
		  Anganwadi a = (Anganwadi) session.load(Anganwadi.class, new Integer(id));
		  if (null != a) {
		   session.delete(a);
		  }
	 } 
}