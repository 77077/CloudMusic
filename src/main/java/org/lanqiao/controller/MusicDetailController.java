package org.lanqiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MusicDetailController {
	
	@RequestMapping("MusicDetail")
	public String detail(){
		return "musicDetail";
	}
}
