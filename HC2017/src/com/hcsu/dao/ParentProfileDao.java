package com.hcsu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcsu.model.ParentProfile;

/**
 * @author vishal.settipalli
 *
 */
@Repository
public class ParentProfileDao {

	 @Autowired
	 private SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
		 this.sessionFactory = sf;
	 }
	
	 public List<ParentProfile> getAllParentProfile() {
		  Session session = this.sessionFactory.getCurrentSession();
		  List<ParentProfile> parentProfileList = session.createQuery("from ParentProfile").list();
		  return parentProfileList;
	 }
	
	 public ParentProfile getParentProfile(int id) {
		  Session session = this.sessionFactory.getCurrentSession();
		  ParentProfile parentProfile = (ParentProfile) session.load(ParentProfile.class, new Integer(id));
		  return parentProfile;
	 }
	
	 public ParentProfile addParentProfile(ParentProfile parentProfile) {
		  Session session = this.sessionFactory.getCurrentSession();
		  session.persist(parentProfile);
		  return parentProfile;
	 }
	
	 public void updateParentProfile(ParentProfile parentProfile) {
		  Session session = this.sessionFactory.getCurrentSession();
		  session.update(parentProfile);
	 }
	
	 public void deleteParentProfile(int id) {
		  Session session = this.sessionFactory.getCurrentSession();
		  ParentProfile a = (ParentProfile) session.load(ParentProfile.class, new Integer(id));
		  if (null != a) {
		   session.delete(a);
		  }
	 } 
}