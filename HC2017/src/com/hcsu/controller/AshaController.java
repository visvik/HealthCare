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
import com.hcsu.model.Asha;
import com.hcsu.model.vo.ParentProfileVO;
import com.hcsu.service.AshaService;

/**
 * @author vishal.settipalli
 *
 */
@RestController
public class AshaController {
	
	@Autowired
	AshaService ashaService;
	
	private ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(value = "/getAllAshaCoordinators", method = RequestMethod.GET, headers = "Accept=application/json")
	 public ArrayList<Asha> getAsha() {
	  
		  ArrayList<Asha> listOfAshaCo = new ArrayList<Asha>(); 
		  ashaService.getAllAsha();
		  return listOfAshaCo;
	 }
	
	@RequestMapping(value = "/getAsha/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	 public Asha getAshaById(@PathVariable int id) {
		return ashaService.getAsha(id);
	 }

	 @RequestMapping(value = "/addAsha", method = RequestMethod.POST, headers = "Accept=application/json")
	 public void addAsha(@RequestBody String ashaJson) {
		 Asha asha = new Asha();
		 try {
			asha = mapper.readValue(ashaJson, Asha.class);
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 
		 ashaService.addAsha(asha);
	 }

	 @RequestMapping(value = "/updateAsha", method = RequestMethod.PUT, headers = "Accept=application/json")
	 public void updateAsha(@RequestBody String ashaJson) {
		 Asha asha = new Asha();
		 try {
			asha = mapper.readValue(ashaJson, Asha.class);
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 
		 ashaService.updateAsha(asha);
	 }

	 @RequestMapping(value = "/deleteAsha/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	 public void deleteAsha(@PathVariable("id") int id) {
		 ashaService.deleteAsha(id);  
	 } 

}
