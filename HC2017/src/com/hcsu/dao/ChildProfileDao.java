package com.hcsu.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcsu.model.ChildProfile;

/**
 * @author vishal.settipalli
 *
 */
@Repository
public class ChildProfileDao {

	 @Autowired
	 private SessionFactory sessionFactory;
	
	 public void setSessionFactory(SessionFactory sf) {
		 this.sessionFactory = sf;
	 }
	
	 public List<ChildProfile> getAllChildProfile() {
		  Session session = this.sessionFactory.getCurrentSession();
		  List<ChildProfile> childProfileList = session.createQuery("from ChildProfile").list();
		  return childProfileList;
	 }
	
	 public ChildProfile getChildProfile(int id) {
		  Session session = this.sessionFactory.getCurrentSession();
		  ChildProfile childProfile = (ChildProfile) session.load(ChildProfile.class, new Integer(id));
		  return childProfile;
	 }
	
	 public ChildProfile addChildProfile(ChildProfile childProfile) {
		  Session session = this.sessionFactory.getCurrentSession();
		  session.persist(childProfile);
		  return childProfile;
	 }
	
	 public void updateChildProfile(ChildProfile childProfile) {
		  Session session = this.sessionFactory.getCurrentSession();
		  session.update(childProfile);
	 }
	
	 public void deleteChildProfile(int id) {
		  Session session = this.sessionFactory.getCurrentSession();
		  ChildProfile a = (ChildProfile) session.load(ChildProfile.class, new Integer(id));
		  if (null != a) {
		   session.delete(a);
		  }
	 } 
}