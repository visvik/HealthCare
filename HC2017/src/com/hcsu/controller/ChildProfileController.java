package com.hcsu.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcsu.model.ChildProfile;
import com.hcsu.service.ChildProfileService;

/**
 * @author vishal.settipalli
 *
 */
@RestController
public class ChildProfileController {
	
	@Autowired
	ChildProfileService childProfileService;
	
	@RequestMapping(value = "/getAllChildProfile", method = RequestMethod.GET, headers = "Accept=application/json")
	 public ArrayList<ChildProfile> getAllChildProfile() {
	  
		  ArrayList<ChildProfile> listOfChildProfile = new ArrayList<ChildProfile>(); 
		  childProfileService.getAllChildProfile();
		  return listOfChildProfile;
	 }
	
	@RequestMapping(value = "/getChildProfile/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	 public ChildProfile getChildProfile(@PathVariable int id) {
		return childProfileService.getChildProfile(id);
	 }

	 @RequestMapping(value = "/addChildProfile", method = RequestMethod.POST, headers = "Accept=application/json")
	 public void addChildProfile(@RequestBody ChildProfile childProfile) { 
		 
		 childProfileService.addChildProfile(childProfile);
	 }

	 @RequestMapping(value = "/updateChildProfile", method = RequestMethod.PUT, headers = "Accept=application/json")
	 public void updateChildProfile(@RequestBody ChildProfile childProfile) {
		 childProfileService.updateChildProfile(childProfile);
	 }

	 @RequestMapping(value = "/deleteChildProfile/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	 public void deleteChildProfile(@PathVariable("id") int id) {
		 childProfileService.deleteChildProfile(id);  
	 } 

}
