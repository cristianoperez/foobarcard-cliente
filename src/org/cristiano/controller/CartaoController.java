package org.cristiano.controller;

import javax.annotation.Resource;

import org.cristiano.model.Cartao;
import org.cristiano.model.CartaoList;
import org.cristiano.service.CartaoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@Controller
public class CartaoController {

	@Resource(name = "cartaoService")
	private CartaoService cartaoService;
	
	RestTemplate restTemplate = new RestTemplate();
	
	@RequestMapping(value = "/cartoes", method = RequestMethod.GET, headers="Accept=application/xml, application/json")
	public @ResponseBody CartaoList getCartoes(){
		CartaoList cartoes = new CartaoList();	
		cartoes.setDados(cartaoService.getAll());
		return cartoes;
	}
	
	@RequestMapping(value = "/cartao/{numeroCartao}", method = RequestMethod.GET, headers = "Accept=application/xml, application/json")
	public @ResponseBody Cartao getCartao(@PathVariable("numeroCartao")Long numeroCartao){
		return cartaoService.get(numeroCartao);
	}	
}
