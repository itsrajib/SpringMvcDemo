package com.rajib;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rajib.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j, HttpServletRequest request,
			HttpServletResponse response) {

		AddService service = new AddService();
		int result = service.add(i, j);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("res", result);

		return mv;
	}

}
