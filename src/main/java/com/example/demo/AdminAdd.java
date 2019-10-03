package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminAdd {
	
	//管理者追加ページへ遷移
	@GetMapping("/AdminAdd")
	public String addGo(Model model) {
		return "AdminAdd";
	}

}
