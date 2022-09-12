package com.jesus.gruposalinas.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/usuario")
@SprintBootApplication(exclude = DataSurceAutoConfiguration.class)
public class resController {
	
	@Value("{dirlocal}")
	private String  direccionLocal="";
	
	@RequestMapping
	(value = "/add", method = RequestMethod.POST, headers= "Accept=application/json",produces="application/json; charset=utf-8")
	public @ResponseBody String crear() {
		
		System.out.println("wl error es "+ direccionLocal);
		
		return direccionLocal;
	}
	

}
