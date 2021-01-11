package it.begear.ecommerce.entity;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
	private List<Object> carrello= new ArrayList<Object>();
	
	public Carrello() {
		// TODO Auto-generated constructor stub
	}

	public List<Object> getCarrello() {
		return carrello;
	}

	public void setCarrello(List<Object> carrello) {
		this.carrello = carrello;
	}

	@Override
	public String toString() {
		return "Carrello [carrello=" + carrello + "]";
	}
	
	

}
