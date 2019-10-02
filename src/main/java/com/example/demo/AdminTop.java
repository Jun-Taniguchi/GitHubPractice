package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminTop {

	//管理者画面トップページへ遷移
	@GetMapping("/")
	public String topGo() {
		return "AdminTop";
	}
	
	//管理者一覧ページへ遷移
	@GetMapping("/aList")
	public String listGo() {
		return "AdminList";
	}
	
	//管理者検索ページへ遷移
	@GetMapping("/aSearch")
	public String searchGo() {
		return "AdminSearch";
	}

}
