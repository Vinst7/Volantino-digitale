package it.begear.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.begear.ecommerce.entity.Abbigliamento;
import it.begear.ecommerce.repository.AbbigliamentoRepository;

@Service
public class AbbigliamentoService {
	@Autowired
	private AbbigliamentoRepository repository;
	
	//Ricerca
	public List<Abbigliamento> ListAll (String keyword){
		if(keyword != null) {
			return repository.search(keyword);
		}
		return repository.findAll();
	}
	
	//Aggiungere al DB
	public void save(Abbigliamento a) {
		repository.save(a);
	}
	
	//Update
	public Abbigliamento getAbb(Integer id_abb) {
		return repository.findById(id_abb).get();
	}
	
	//delete
	public void delete(Integer id_abb) {
		repository.deleteById(id_abb);
	}
	
	
	

}
