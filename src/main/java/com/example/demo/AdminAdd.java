package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminAdd {
	
	@Autowired
	ProductRepository pRepository;
	
	@Autowired
	CategoryRepository cRepository;
	
	//管理者追加ページへ遷移
	@GetMapping("/AdminAdd")
	public String addGo(Model model) {
		return "AdminAdd";
	}

	//管理者追加処理
	@PostMapping("/aAdd")
	public String addA(Model model,
						@RequestParam("product_name")String product_nmame,
						@RequestParam("category_id")String category_id,
						@RequestParam("price")int price,
						@RequestParam("size")int size,
						@RequestParam("manufacture")String manufacture,
						@RequestParam("color")String color,
						@RequestParam("product_img")String product_img,
						@RequestParam("stock")int stock,
						@RequestParam("product_info")String product_info){
		model.addAttribute("addOk", "追加完了しました。");
		
		return "AdminAdd";
	}
}
