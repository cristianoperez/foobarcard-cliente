package org.cristiano.controller;

import javax.annotation.Resource;

import org.cristiano.model.CartaoList;
import org.cristiano.service.CartaoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@Controller
public class CartaoController {

	@Resource(name = "cartaoService")
	private CartaoService cartaoResource;
	
	RestTemplate restTemplate = new RestTemplate();
	
	@RequestMapping(value = "/cartoes", method = RequestMethod.GET, headers="Accept=application/xml, application/json")
	public @ResponseBody CartaoList getCartoes(){
		CartaoList cartoes = new CartaoList();	
		cartoes.setDados(cartaoResource.getAll());
		return cartoes;
	}
	
	@RequestMapping(value = "/cartao/{numeroCartao}", method = RequestMethod.GET, headers = "Accept=application/html, application/xhtml+xml")
	public String getPersonHTML(@PathVariable("numeroCartao")Long numeroCartao, Model model){
		model.addAttribute("cartao", cartaoResource.get(numeroCartao));
		return "getcartao";
	}	
}
