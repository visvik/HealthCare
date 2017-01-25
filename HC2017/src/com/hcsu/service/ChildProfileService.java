package com.hcsu.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcsu.dao.ChildProfileDao;
import com.hcsu.model.ChildProfile;

/**
 * @author vishal.settipalli
 *
 */
@Service
public class ChildProfileService {
	@Autowired
	ChildProfileDao childProfileDao;
	 
	 @Transactional
	 public ArrayList<ChildProfile> getAllChildProfile() {
	  return (ArrayList<ChildProfile>) childProfileDao.getAllChildProfile();
	 }

	 @Transactional
	 public ChildProfile getChildProfile(int id) {
	  return childProfileDao.getChildProfile(id);
	 }

	 @Transactional
	 public ChildProfile addChildProfile(ChildProfile childProfile) {
		 return childProfileDao.addChildProfile(childProfile);
	 }

	 @Transactional
	 public void updateChildProfile(ChildProfile childProfile) {
		 childProfileDao.updateChildProfile(childProfile);

	 }

	 @Transactional
	 public void deleteChildProfile(int id) {
		 childProfileDao.deleteChildProfile(id);
	 }
}
