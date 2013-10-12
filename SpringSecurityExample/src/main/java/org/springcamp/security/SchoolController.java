package org.springcamp.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("school")
public class SchoolController {
	private static final Logger log = LoggerFactory.getLogger(SchoolController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		log.debug("school");
		return "school";
	}
	
	@RequestMapping(value = "exam", method = RequestMethod.GET)
	public @ResponseBody String exam(Model model) {
		log.debug("school/exam");
		return "school/exam";
	}
	
}
