package br.com.codawer.ws.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.codawer.ws.model.Tasks;
import br.com.codawer.ws.service.TasksService;

@RestController
public class TaskController {
	@Autowired
	TasksService tasksService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/tasks", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Tasks> createTask(@RequestBody Tasks task) {
		Tasks taskCreated = tasksService.create(task);
		System.out.println("Criado");
		
		return new ResponseEntity<>(taskCreated, HttpStatus.CREATED);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/tasks", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Tasks> updateTask(@RequestBody Tasks task) {
		tasksService.update(task);
		System.out.println("Criado");
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/tasks/{id}")
	public ResponseEntity<Tasks> deleteTask(@PathVariable Integer id) {
		Tasks taskFound = tasksService.findById(id);
		tasksService.delete(taskFound);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

	@RequestMapping(method = RequestMethod.GET, value = "/tasks", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Tasks>> findAllTasks() {
		
		Collection<Tasks> tasksFound = tasksService.findAll();
		System.out.println("Buscados");
		
		return new ResponseEntity<>(tasksFound, HttpStatus.OK);
		
	}
}
