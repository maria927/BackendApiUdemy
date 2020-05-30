package com.personal.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.personal.springboot.backend.apirest.models.dao.IClienteDao;
import com.personal.springboot.backend.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired //Inyección de dependencias
	private IClienteDao clienteDao;
	
	
	@Override
	@Transactional(readOnly = true) //Se puede omitir porque está por defecto
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}


	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		
		return clienteDao.findById(id).orElse(null); //Devuelve un cliente, si no lo encuentra, retorne null
	}


	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		
		return clienteDao.save(cliente);
	}


	@Override
	public void delete(Long id) {
		
		clienteDao.deleteById(id);
	}

}
