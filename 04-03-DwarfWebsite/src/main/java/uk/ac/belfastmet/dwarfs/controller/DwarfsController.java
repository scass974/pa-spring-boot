package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.dwarfs.service.DwarfService;

@Controller
@RequestMapping

public class DwarfsController {
	
	@Autowired
	private DwarfService dwarfService;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public String homePage() {
		return "index";
	}
	
	@RequestMapping(value="/disney", method = RequestMethod.GET)
	public String disneyPage(Model model) {
		model.addAttribute("pageTitle","Disney Dwarfs");
		model.addAttribute("dwarfs",dwarfService.getNumberOfDwarfs());
		return "disney";
	}
	
	@RequestMapping(value="/tolkien", method = RequestMethod.GET)
	public String tolkienPage(Model model) {
		model.addAttribute("pageTitle","Tolkien Dwarfs");
		model.addAttribute("dwarfs",dwarfService.getNumberOfDwarfs());
		return "tolkien";
	}
	
}
