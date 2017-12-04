package br.com.codawer.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.codawer.ws.model.Tasks;

@Repository
public interface TasksRepository extends JpaRepository<Tasks,Integer>{

}
