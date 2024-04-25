package com.example.To.Do.App.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.To.Do.App.Model.ToDo;
import com.example.To.Do.App.Repo.ToDoRepo;

@Service
public class ToDoService {
	@Autowired
	ToDoRepo repo;
	
	public List<ToDo> getAllToDoItems(){
		ArrayList<ToDo> todoList=new ArrayList();
		repo.findAll().forEach(todo->todoList.add(todo));
		return todoList;
		
	}
	
	public ToDo getToDoItemId(Long id) {
		return repo.findById(id).get();
	}

}
