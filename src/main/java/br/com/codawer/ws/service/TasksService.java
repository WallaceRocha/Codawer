package br.com.codawer.ws.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codawer.ws.model.Tasks;
import br.com.codawer.ws.repository.TasksRepository;
@Service
public class TasksService {
	@Autowired
	TasksRepository repository;
	
	Map<Integer,Tasks> tasks = new HashMap<>();
	Integer nextId=1;
	
	public Tasks create(Tasks task) {
		return repository.save(task);
	}
	public Collection<Tasks> findAll(){
		return repository.findAll();
	}
	public void delete(Tasks task) {
		repository.delete(task);
	}
	public Tasks findById(Integer id) {
		return repository.findOne(id);
	}
	public void update(Tasks task) {
		repository.save(task);
	}
}
