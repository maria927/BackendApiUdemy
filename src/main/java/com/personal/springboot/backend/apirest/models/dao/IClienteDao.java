package com.personal.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.personal.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> //Cliente es el nombre de la clase Entity y Long es el tipo de dato de la Primary Key
{
	

}
