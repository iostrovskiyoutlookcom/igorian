package org.itstep.mining_shop;

import java.util.Vector;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import models.News;
import models.NewsContext;

@Controller
public class NewsController {
	
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public String home(Model model) {
		
		NewsContext context = new NewsContext();		
		Vector<News> news = context.getAllNews();
		
		model.addAttribute("title", "Новости" );
		model.addAttribute("style","resources/css/news.css");
		model.addAttribute("script","resources/css/news.js");		
		model.addAttribute("news", news);
		
		return "news/index";
	}

}
