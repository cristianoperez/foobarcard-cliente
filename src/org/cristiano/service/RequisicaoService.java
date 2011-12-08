package org.cristiano.service;

import org.cristiano.dao.CartaoDAO;
import org.cristiano.model.Cartao;
import org.cristiano.model.Resposta;
import org.springframework.stereotype.Service;

@Service("requisicaoService")
public class RequisicaoService {

	Resposta requisicao = new Resposta();

	public Resposta novaRequisicao(Cartao cartao){
		Cartao cartaoDAO = CartaoDAO.getCartaoDAO().getCartao(cartao.getNumeroCartao());
		if (cartao.getValor() <= cartaoDAO.getLimite()) {
			cartaoDAO.setLimite(cartaoDAO.getLimite() - cartao.getValor());
			requisicao.setCodigoRetorno(0);
		} else {
			requisicao.setCodigoRetorno(1);
		}
		return requisicao;
	}
	

}
