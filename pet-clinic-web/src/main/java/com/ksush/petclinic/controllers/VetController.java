package com.ksush.petclinic.controllers;

import com.ksush.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VetController {

	private final VetService vetService;

	public VetController(VetService vetService) {
		this.vetService = vetService;
	}


	@RequestMapping(value = {"/vets", "/vets/index", "/vets/index.html"}, method  = RequestMethod.GET)
	public String ListVets(Model model) {
		model.addAttribute("vets", vetService.findAll());

		return "vets/index";
	}
}
