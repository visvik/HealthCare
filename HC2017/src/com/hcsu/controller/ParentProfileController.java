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
import com.hcsu.model.ChildProfile;
import com.hcsu.model.ParentProfile;
import com.hcsu.model.vo.ParentProfileVO;
import com.hcsu.service.AnganwadiService;
import com.hcsu.service.ChildProfileService;
import com.hcsu.service.ParentProfileService;

/**
 * @author vishal.settipalli
 *
 */
@RestController
public class ParentProfileController {
	
	@Autowired
	ParentProfileService parentProfileService;
	
	@Autowired
	ChildProfileService childProfileService;
	
	private ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(value = "/getAllParentProfile", method = RequestMethod.GET, headers = "Accept=application/json")
	 public ArrayList<ParentProfile> getAllParentProfile() {
	  
		  ArrayList<ParentProfile> listOfParentProfile = new ArrayList<ParentProfile>(); 
		  parentProfileService.getAllParentProfile();
		  return listOfParentProfile;
	 }
	
	@RequestMapping(value = "/getParentProfile/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	 public ParentProfile getParentProfile(@PathVariable int id) {
		return parentProfileService.getParentProfile(id);
	 }

	 @RequestMapping(value = "/addParentProfile", method = RequestMethod.POST, headers = "Accept=application/json")
	 public void addParentProfile(@RequestBody String parentProfileVO) {
		 
		 ParentProfileVO ppVO = new ParentProfileVO();
		 System.out.println(parentProfileVO);
		 try {
			ppVO = mapper.readValue(parentProfileVO, ParentProfileVO.class);
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 ParentProfile pp = new ParentProfile();
		 
		 pp.setAadharId(ppVO.getAadharId());
		 pp.setAddress(ppVO.getAddress());
		 pp.setFatherName(ppVO.getFatherName());
		 pp.setMotherName(ppVO.getMotherName());
		 pp.setMobileNo(ppVO.getMobileNo());
		 pp.setPhone(ppVO.getPhone());
		 pp.setNoOfChildren(ppVO.getNoOfChildren());
		 
		 ParentProfile parentProfile = parentProfileService.addParentProfile(pp);
		 
		 if (parentProfile.getNoOfChildren() > 0){
			 for (int i=0;i<parentProfile.getNoOfChildren();i++){
				 ChildProfile cp = new ChildProfile();
				 cp.setAnganwadiId(ppVO.getAnganwadiId());
				 cp.setAshaId(ppVO.getAshaId());
				 cp.setParentProfileId(parentProfile.getParentProfileId());
				 
				 childProfileService.addChildProfile(cp);
			 }
		 }
	 }

	 @RequestMapping(value = "/updateParentProfile", method = RequestMethod.PUT, headers = "Accept=application/json")
	 public void updateParentProfile(@RequestBody ParentProfile parentProfile) {
		 parentProfileService.updateParentProfile(parentProfile);
	 }

	 @RequestMapping(value = "/deleteParentProfile/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	 public void deleteParentProfile(@PathVariable("id") int id) {
		 parentProfileService.deleteParentProfile(id);  
	 } 

}
