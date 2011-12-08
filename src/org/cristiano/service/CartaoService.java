package org.cristiano.service;

import java.util.List;

import org.cristiano.dao.CartaoDAO;
import org.cristiano.model.Cartao;
import org.springframework.stereotype.Service;


@Service("cartaoService")
public class CartaoService {
	
	CartaoDAO cartaoDAO = CartaoDAO.getCartaoDAO();

	public List<Cartao> getAll(){
		List<Cartao> cartoes = cartaoDAO.getCartoes();
		return cartoes;
	}
	
	public Cartao get(Long numeroCartao){
		Cartao cartao = cartaoDAO.getCartao(numeroCartao);
		return cartao;
	}

}
