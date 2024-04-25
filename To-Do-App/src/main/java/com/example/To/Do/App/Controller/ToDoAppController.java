package com.example.To.Do.App.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.To.Do.App.Service.ToDoService;

@Controller
public class ToDoAppController {
	
	@Autowired
	private ToDoService service;
	

	
	@GetMapping("/viewList")
	public String viewToDoItems(Model model) {
		model.addAttribute("list",service.getAllToDoItems());
		
		return "ViewToDoList";
	}
	
	/*
	 * @GetMapping("/addToDoItem") public String addToDoItem(Model model) { return
	 * "AddToDoItem"; }
	 */
	/*
	 * @GetMapping("/edititem/{id}") public String editItem(@PathVariable Long
	 * id,Model model) { model.addAttribute("todo",service.getToDoItemId(id));
	 * return "EditItem"; }
	 * 
	 * @GetMapping("/delete/{id}") public String deleteToDoItem(@PathVariable Long
	 * id,RedirectAttributes redirect) { return ""; }
	 */
	
	
	
	

}
