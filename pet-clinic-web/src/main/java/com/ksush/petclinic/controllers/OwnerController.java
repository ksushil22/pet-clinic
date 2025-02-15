package com.ksush.petclinic.controllers;

import com.ksush.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/owners")
public class OwnerController {
	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}


	@RequestMapping(value = {"", "/index", "/index.html"}, method  = RequestMethod.GET)
	public String ListOwner(Model model) {
		model.addAttribute("owners",ownerService.findAll());
		return "owners/index";
	}
}
