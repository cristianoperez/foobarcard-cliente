package org.cristiano.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@XmlRootElement
@XmlType(propOrder = { "numeroCartao", "dataExpiracao", "limite", "valor" })
public class Cartao {

	private long numeroCartao;
	private Double limite;
	private Date dataExpiracao;
	
	@NumberFormat(style = Style.NUMBER, pattern = "##,##")
	private Double valor;
	
	public Cartao(){
	}
	
	public Cartao(long numeroCartao, Double limite, Date dataExpiracao){
		this.numeroCartao = numeroCartao;
		this.dataExpiracao = dataExpiracao;
		this.limite = limite;
	}
	
	@XmlElement(name = "numeroCartao")
	public long getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
	@XmlElement(name = "limite", required = false)
	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	@XmlElement(name = "dataExpiracao")
	public String getDataExpiracao() {
		SimpleDateFormat df = new SimpleDateFormat("MM/yy");
		return df.format(dataExpiracao.getTime());
	}

	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}
	
	@XmlElement(name = "valor")
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
