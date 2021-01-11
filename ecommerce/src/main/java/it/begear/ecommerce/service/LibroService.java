package it.begear.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.begear.ecommerce.entity.Libro;
import it.begear.ecommerce.repository.LibroRepository;

@Service
public class LibroService {
	@Autowired
	private LibroRepository repository;
	
	//Ricerca
			public List<Libro> ListAll (String keyword){
				if(keyword != null) {
					return repository.search(keyword);
				}
				return repository.findAll();
			}
			
			//Aggiungere al DB
			public void save(Libro l) {
				repository.save(l);
			}
			
			//Update
			public Libro getLib(Integer id_lib) {
				return repository.findById(id_lib).get();
			}
			
			//delete
			public void delete(Integer id_lib) {
				repository.deleteById(id_lib);
			}

}
