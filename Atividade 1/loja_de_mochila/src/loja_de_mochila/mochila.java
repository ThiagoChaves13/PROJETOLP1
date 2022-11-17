package loja_de_mochila;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mochila {

	//Atributos da classe
	private String Marca;
	private String Cor;
	private Double Quantidade_de_ziper;
	private String Com_rodinha;
	private String Tamanho;
	
	public String salvar() {
	
		try {
			FileWriter fw = new FileWriter("Mochilas.csv", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(this.Marca + "," + this.Cor + "," + this.Quantidade_de_ziper + "," + this.Com_rodinha + "," +this.Tamanho);
			pw.flush();
			pw.close();
			fw.close();
		
	
		} catch (IOException ex) {
		// TODO Auto-generated catch block
			Logger.getLogger(mochila.class.getName()).log(Level.SEVERE, null, ex);
		}
	
		return "Mochila cadastrada!" ;
	}


	public String getMarca() {
		return Marca;
	}



	public void setMarca(String Marca) {
		this.Marca = Marca;
	}



	public String getCor() {
		return Cor;
	}



	public void setCor(String Cor) {
		this.Cor = Cor;
	}



	public Double getQuantidade_de_ziper() {
		return Quantidade_de_ziper;
	}



	public void setQuantidade_de_ziper(Double Quantidade_de_ziper) {
		this.Quantidade_de_ziper = Quantidade_de_ziper;
	}



	public String getCom_rodinha() {
		return Com_rodinha;
	}



	public void setCom_rodinha(String Com_rodinha) {
		this.Com_rodinha = Com_rodinha;
	}



	public String getTamanho() {
		return Tamanho;
	}



	public void setTamanho(String Tamanho) {	
		this.Tamanho = Tamanho;
	}	




}
