package it.begear.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.begear.ecommerce.entity.Elettronica;

public interface ElettronicaRepository extends JpaRepository<Elettronica, Integer> {
	@Query("SELECT e FROM Elettronica e WHERE CONCAT(e.marca, e.tipo, e.modello, e.prezzo) LIKE %?1%")
	public List<Elettronica> search (String keyword);

}
