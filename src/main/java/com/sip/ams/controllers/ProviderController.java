package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProviderController {
    @GetMapping("/providers")
	//@ResponseBody
	public String providers()
	{
		return "providers/providers";
	}
}
