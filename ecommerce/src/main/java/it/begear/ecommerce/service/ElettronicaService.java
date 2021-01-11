package it.begear.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.begear.ecommerce.entity.Elettronica;
import it.begear.ecommerce.repository.ElettronicaRepository;

@Service
public class ElettronicaService {
	@Autowired
	private ElettronicaRepository repository;
	
	//Ricerca
		public List<Elettronica> ListAll (String keyword){
			if(keyword != null) {
				return repository.search(keyword);
			}
			return repository.findAll();
		}
		
		//Aggiungere al DB
		public void save(Elettronica e) {
			repository.save(e);
		}
		
		//Update
		public Elettronica getEle(Integer id_ele) {
			return repository.findById(id_ele).get();
		}
		
		//delete
		public void delete(Integer id_ele) {
			repository.deleteById(id_ele);
		}

}
