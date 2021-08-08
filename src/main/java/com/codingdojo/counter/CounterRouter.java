package com.codingdojo.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterRouter {

	@RequestMapping("/")
	public String home(HttpSession session, Model model) {
		if(session.getAttribute("count")==null || session.getAttribute("count").equals("")) {
			session.setAttribute("count", 1);
		} else {
			session.setAttribute("count", (int)session.getAttribute("count") + 1);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		if(session.getAttribute("count")==null || session.getAttribute("count").equals("")) {
			model.addAttribute("count", 0);
		} else {
			model.addAttribute(session.getAttribute("count"));
		}
		return "counter.jsp";
	}
}
