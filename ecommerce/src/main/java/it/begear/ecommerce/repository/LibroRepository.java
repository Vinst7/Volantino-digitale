package it.begear.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.begear.ecommerce.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
	@Query("SELECT l FROM Libro l WHERE CONCAT(l.autore, l.titolo, l.genere, l.prezzo) LIKE %?1%")
	public List<Libro> search (String keyword);

}
