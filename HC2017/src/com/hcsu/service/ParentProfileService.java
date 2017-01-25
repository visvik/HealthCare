package com.hcsu.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcsu.dao.ParentProfileDao;
import com.hcsu.model.ParentProfile;

/**
 * @author vishal.settipalli
 *
 */
@Service
public class ParentProfileService {
	@Autowired
	 ParentProfileDao parentProfileDao;
	 
	 @Transactional
	 public ArrayList<ParentProfile> getAllParentProfile() {
	  return (ArrayList<ParentProfile>) parentProfileDao.getAllParentProfile();
	 }

	 @Transactional
	 public ParentProfile getParentProfile(int id) {
	  return parentProfileDao.getParentProfile(id);
	 }

	 @Transactional
	 public ParentProfile addParentProfile(ParentProfile parentProfile) {
		 
		 ParentProfile pp = parentProfileDao.addParentProfile(parentProfile);
		 
		 return pp;
	 }

	 @Transactional
	 public void updateParentProfile(ParentProfile parentProfile) {
		 parentProfileDao.updateParentProfile(parentProfile);

	 }

	 @Transactional
	 public void deleteParentProfile(int id) {
		 parentProfileDao.deleteParentProfile(id);
	 }
}
