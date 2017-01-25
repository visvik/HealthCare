package com.hcsu.model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcsu.model.*;
import com.hcsu.model.vo.ParentProfileVO;

public class TestMain {
	public static void main(String[] args){
	
	ObjectMapper mapper = new ObjectMapper();

	Asha asha = new Asha();
	Anganwadi an = new Anganwadi();
	ParentProfileVO ppvo = new ParentProfileVO();

	try {

		// Convert object to JSON string
		String jsonInString = mapper.writeValueAsString(asha);
		System.out.println(jsonInString);
		
		String jsonInString1 = mapper.writeValueAsString(an);
		System.out.println(jsonInString1);
		
		String jsonInString2 = mapper.writeValueAsString(ppvo);
		System.out.println(jsonInString2);

	} catch (JsonGenerationException e) {
		e.printStackTrace();
	} catch (JsonMappingException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
