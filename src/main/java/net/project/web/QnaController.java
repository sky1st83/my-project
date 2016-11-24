package net.project.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import net.project.model.Qna;

@Controller
public class QnaController {
	private ArrayList<Qna> qnas = new ArrayList<>();
	
	@GetMapping("/qnas")
	public String list(Model model){
		model.addAttribute("qnas", qnas);
		return"/qna/list";
	}
	
	@PostMapping("/qna/create")
	public String create(Qna qna){
		
		qnas.add(qna);
		return"redirect:/qnas";
	}
	
	@GetMapping("/qna/form")
	public String form(Model model){
		return"/qna/form";
	}
}
