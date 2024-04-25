package com.example.To.Do.App.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.To.Do.App.Model.ToDo;

@Repository
public interface ToDoRepo extends JpaRepository<ToDo,Long>{

}
