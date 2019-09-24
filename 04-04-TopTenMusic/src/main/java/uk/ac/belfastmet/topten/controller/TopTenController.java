package uk.ac.belfastmet.topten.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.topten.service.TopTenService;


@Controller
@RequestMapping

public class TopTenController {
	
    //Created logger
	Logger topTenLogger = LoggerFactory.getLogger(TopTenController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage() {
		topTenLogger.info("Accessed home page");
		return "index";
	}
    //Returns tracks page
	@RequestMapping(value = "/tracks", method = RequestMethod.GET)
	public String tracksPage(Model model) {
		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle","Tracks");
		model.addAttribute("tracks",topTenService.getSoundtrackTopTens());
		topTenLogger.info("Accessed tracks page");
		return "tracks";
	}
    //Returns albums page 
	@RequestMapping(value = "/albums", method = RequestMethod.GET)
	public String albumsPage(Model model) {
		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle","Albums");
		model.addAttribute("albums",topTenService.getAlbumTopTens());
		topTenLogger.info("Accessed albums page");
		return "albums";
	}
	
}