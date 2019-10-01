package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminTop {

	//管理者画面トップページへ遷移
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String topGo(Model model) {
		return "AdminTop";
	}
	
	//管理者
	@RequestMapping(value="/pList", method=RequestMethod.GET)
	public String listGo(Model model) {
		return "AdminList";
	}
	

}
