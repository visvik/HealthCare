package com.hcsu.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcsu.dao.AnganwadiDao;
import com.hcsu.model.Anganwadi;

/**
 * @author vishal.settipalli
 *
 */
@Service
public class AnganwadiService {
	@Autowired
	 AnganwadiDao anganwadiDao;
	 
	 @Transactional
	 public ArrayList<Anganwadi> getAllAnganwadi() {
	  return (ArrayList<Anganwadi>) anganwadiDao.getAllAnganwadi();
	 }

	 @Transactional
	 public Anganwadi getAnganwadi(int id) {
	  return anganwadiDao.getAnganwadi(id);
	 }

	 @Transactional
	 public void addAnganwadi(Anganwadi anganwadi) {
		 anganwadiDao.addAnganwadi(anganwadi);
	 }

	 @Transactional
	 public void updateAnganwadi(Anganwadi anganwadi) {
		 anganwadiDao.updateAnganwadi(anganwadi);

	 }

	 @Transactional
	 public void deleteAnganwadi(int id) {
		 anganwadiDao.deleteAnganwadi(id);
	 }
}
