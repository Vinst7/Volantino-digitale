package it.begear.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_lib")
	private int id_lib;
	@Column(name = "autore")
	private String autore;
	@Column(name = "titolo")
	private String titolo;
	@Column(name = "genere")
	private String genere;
	@Column(name = "prezzo")
	private double prezzo;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public int getId_lib() {
		return id_lib;
	}

	public void setId_lib(int id_lib) {
		this.id_lib = id_lib;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
}
