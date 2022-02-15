package com.streamit.test.controller;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("")
public class TestController {
	private Logger logger = LoggerFactory.getLogger("TestController");


	@RequestMapping(value = "/{locale}", method = RequestMethod.GET)
	public Map<String,Object> getTest(@PathVariable("locale") String locale	) throws Exception {
		Map<String,Object> result = new HashMap<>();
		logger.info("locale={}",locale);
		result.put("locale",locale);
		return result;
	}

	@RequestMapping(value = "/{locale}/mav", method = RequestMethod.GET)
	public ModelAndView getpayInsurance(@PathVariable("locale") String locale	) throws Exception {
		ModelAndView mav = new ModelAndView("test1");
		logger.info("locale={}",locale);

		return mav;
	}



}
