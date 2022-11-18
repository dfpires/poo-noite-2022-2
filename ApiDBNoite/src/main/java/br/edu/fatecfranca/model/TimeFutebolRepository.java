package br.edu.fatecfranca.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeFutebolRepository extends 

		JpaRepository<TimeFutebol, Long> {

	
	// esta interface vai conter todos os métodos de CRUD para a 
	// classe TimeFutebol

}
