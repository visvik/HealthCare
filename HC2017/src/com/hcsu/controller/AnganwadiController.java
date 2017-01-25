package com.hcsu.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcsu.model.Anganwadi;
import com.hcsu.model.Asha;
import com.hcsu.service.AnganwadiService;

/**
 * @author vishal.settipalli
 *
 */
@RestController
public class AnganwadiController {
	
	@Autowired
	AnganwadiService anganwadiService;
	
	private ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(value = "/getAllAnganwadi", method = RequestMethod.GET, headers = "Accept=application/json")
	 public ArrayList<Anganwadi> getAllAnganwadi() {
	  
		  ArrayList<Anganwadi> listOfAnganwadi = new ArrayList<Anganwadi>(); 
		  anganwadiService.getAllAnganwadi();
		  return listOfAnganwadi;
	 }
	
	@RequestMapping(value = "/getAnganwadi/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	 public Anganwadi getAnganwadi(@PathVariable int id) {
		return anganwadiService.getAnganwadi(id);
	 }

	 @RequestMapping(value = "/addAnganwadi", method = RequestMethod.POST, headers = "Accept=application/json")
	 public void addAnganwadi(@RequestBody String anganwadiJson) { 
		 Anganwadi anganwadi = new Anganwadi();
		 try {
			 anganwadi = mapper.readValue(anganwadiJson, Anganwadi.class);
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 anganwadiService.addAnganwadi(anganwadi);
	 }

	 @RequestMapping(value = "/updateAnganwadi", method = RequestMethod.PUT, headers = "Accept=application/json")
	 public void updateAnganwadi(@RequestBody String anganwadiJson) {
		 Anganwadi anganwadi = new Anganwadi();
		 try {
			 anganwadi = mapper.readValue(anganwadiJson, Anganwadi.class);
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 anganwadiService.updateAnganwadi(anganwadi);
	 }

	 @RequestMapping(value = "/deleteAnganwadi/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	 public void deleteAnganwadi(@PathVariable("id") int id) {
		 anganwadiService.deleteAnganwadi(id);  
	 } 

}
