package org.cristiano.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cartoes")
public class CartaoList {

	private List<Cartao> dados;

	public List<Cartao> getDados() {
		return dados;
	}

	public void setDados(List<Cartao> dados) {
		this.dados = dados;
	}	
}