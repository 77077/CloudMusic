package org.lanqiao.controller;

import org.lanqiao.entity.Music;
import org.lanqiao.service.MusicDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MusicDetailController {
	@Autowired
	MusicDetailService musicDetailServiceImpl;
	
	@RequestMapping("MusicDetail")
	public String detail(Model model){
		Music music = musicDetailServiceImpl.SelectMusicById(4);
		model.addAttribute("music", music);
		return "musicDetail";
	}
}
