package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;

@Controller
@RequestMapping("/heroe")
public class HeroeController {
	@Autowired
	@Qualifier(HeroeServicieimpl)

	@GetMapping("/showheroe")
	public ModelAndViewContainer showHeroe() {
		modelAndView mav = new ModelAndView(ViewHeroe.HEROE);
		return mav;
	}
}