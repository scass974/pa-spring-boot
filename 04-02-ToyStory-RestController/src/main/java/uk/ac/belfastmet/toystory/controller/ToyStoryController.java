package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toystorymovie")

public class ToyStoryController {
	
	@GetMapping("/")
	public String home() {
		return "Characters in the movie Shrek";
	}
	
	@GetMapping("/woody")
	public String woody() {
		return "Woody was played by Tom Hanks";
	}
	
	@GetMapping("/buzz")
	public String donkey() {
		return "Buzz was played by Tim Allen";
	}
	
	@GetMapping("/mrpotato")
	public String mrpotato() {
		return "Mr Potato Head was played by Don Rickles";
	}

}
