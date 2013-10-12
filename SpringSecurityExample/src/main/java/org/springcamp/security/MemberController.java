package org.springcamp.security;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("member")
public class MemberController {
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.debug("member");
		return "member";
	}
	
	@RequestMapping(value = "exam", method = RequestMethod.GET)
	public @ResponseBody String exam(Locale locale, Model model) {
		log.debug("member/exam");
		return "member/exam";
	}
	
}
