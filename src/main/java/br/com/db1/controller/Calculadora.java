package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Calculadora {
	private Double primeiroValor;
	private Double segundoValor;
	private Double resultado;
	
	
	public Double getPrimeiroValor() {
		return primeiroValor;
	}
	public void setPrimeiroValor(Double primeiroValor) {
		this.primeiroValor = primeiroValor;
	}
	public Double getSegundoValor() {
		return segundoValor;
	}
	public void setSegundoValor(Double segundoValor) {
		this.segundoValor = segundoValor;
	}
	public Double getResultado() {
		return resultado;
	}
	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
	public void somar() {
		this.resultado = this.primeiroValor + this.segundoValor;
	}
	
	public void subtrair() {
		this.resultado = this.primeiroValor - this.segundoValor;
	}
	
	public void multiplicar() {
		this.resultado = this.primeiroValor * this.segundoValor;
	}
	
	public void dividir() {
		this.resultado = this.primeiroValor / this.segundoValor;
	
	}
	
}
