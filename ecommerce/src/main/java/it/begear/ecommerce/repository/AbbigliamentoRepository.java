package it.begear.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.begear.ecommerce.entity.Abbigliamento;

public interface AbbigliamentoRepository extends JpaRepository<Abbigliamento, Integer> {
	@Query("SELECT a FROM Abbigliamento a WHERE CONCAT(a.marca, a.tipo ,a.taglia, a.colore, a.prezzo) LIKE %?1%")
	public List<Abbigliamento> search(String keyword);

}
