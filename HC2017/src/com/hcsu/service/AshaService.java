package com.hcsu.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcsu.dao.AshaDao;
import com.hcsu.model.Asha;

/**
 * @author vishal.settipalli
 *
 */
@Service
public class AshaService {
	@Autowired
	 AshaDao ashaDao;
	 
	 @Transactional
	 public ArrayList<Asha> getAllAsha() {
	  return (ArrayList<Asha>) ashaDao.getAllAsha();
	 }

	 @Transactional
	 public Asha getAsha(int id) {
	  return ashaDao.getAsha(id);
	 }

	 @Transactional
	 public void addAsha(Asha asha) {
	  ashaDao.addAsha(asha);
	 }

	 @Transactional
	 public void updateAsha(Asha asha) {
	  ashaDao.updateAsha(asha);

	 }

	 @Transactional
	 public void deleteAsha(int id) {
	  ashaDao.deleteAsha(id);
	 }

}
