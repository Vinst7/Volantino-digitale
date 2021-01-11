package it.begear.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "abbigliamento")
public class Abbigliamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_abb")
	private int id_abb;
	@Column(name = "marca")
	private String marca;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "taglia")
	private String taglia;
	@Column(name = "colore")
	private String colore;
	@Column(name= "prezzo")
	private double prezzo;

	public Abbigliamento() {
		// TODO Auto-generated constructor stub
	}

	public int getId_abb() {
		return id_abb;
	}

	public void setId_abb(int id_abb) {
		this.id_abb = id_abb;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTaglia() {
		return taglia;
	}

	public void setTaglia(String taglia) {
		this.taglia = taglia;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	

	

}
