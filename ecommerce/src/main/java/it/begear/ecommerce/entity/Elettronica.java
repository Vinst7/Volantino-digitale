package it.begear.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "elettronica")
public class Elettronica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ele")
	private int id_ele;
	@Column(name = "marca")
	private String marca;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "modello")
	private String modello;
	@Column(name = "prezzo")
	private double prezzo;
	
	public Elettronica() {
		// TODO Auto-generated constructor stub
	}

	public int getId_ele() {
		return id_ele;
	}

	public void setId_ele(int id_ele) {
		this.id_ele = id_ele;
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

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


}
