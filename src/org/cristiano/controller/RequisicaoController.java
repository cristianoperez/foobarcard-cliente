package org.cristiano.controller;

import javax.annotation.Resource;

import org.cristiano.model.Cartao;
import org.cristiano.model.Resposta;
import org.cristiano.service.RequisicaoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class RequisicaoController {

	@Resource(name = "requisicaoService")
	private RequisicaoService requisicaoService;
	
	RestTemplate restTemplate = new RestTemplate();
	
	
	@RequestMapping(value = "/request", method = RequestMethod.POST, headers = "Accept=application/html, application/xhtml+xml, application/xml" )
	public @ResponseBody Resposta request(@RequestBody Cartao cartao){
		return requisicaoService.novaRequisicao(cartao);
	}
}
