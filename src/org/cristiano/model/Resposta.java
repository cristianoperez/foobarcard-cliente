package org.cristiano.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "resposta")
@XmlType(propOrder={"codigoRetorno", "mensagem"})
public class Resposta {

	private int codigoRetorno;
	private String mensagem;
	
	@XmlElement(name = "codigoRetorno")
	public int getCodigoRetorno() {
		return codigoRetorno;
	}
	public void setCodigoRetorno(int codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}
	
	@XmlElement(name = "mensagem")
	public String getMensagem() {
		if(codigoRetorno == 0){
			mensagem = "Transacao aprovada";
		} else {
			mensagem = "Transacao nao aprovada";
		}
		return mensagem;
	}

}
