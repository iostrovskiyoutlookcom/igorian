package org.itstep.mining_shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EntryController {
	
	@RequestMapping(value = "/entry", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("title", "Авторизация" );
		model.addAttribute("style","resources/css/entry.css");
		model.addAttribute("script","resources/css/entry.js");
		
		return "entry/index";
	}

}
