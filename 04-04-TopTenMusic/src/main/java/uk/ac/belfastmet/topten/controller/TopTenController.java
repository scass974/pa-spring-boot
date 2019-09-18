package uk.ac.belfastmet.topten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.topten.service.TopTenService;


@Controller
@RequestMapping

public class TopTenController {
	
	@GetMapping()
	public String homePage() {
		return "index";
	}
	
	@GetMapping("/tracks")
	public String tracksPage(Model model) {
		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle","Tracks");
		model.addAttribute("tracks",topTenService.getSoundtrackTopTens());
		return "tracks";
	}
	
	@GetMapping("/albums")
	public String albumsPage(Model model) {
		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle","Albums");
		model.addAttribute("albums",topTenService.getAlbumTopTens());
		return "albums";
	}
	
}