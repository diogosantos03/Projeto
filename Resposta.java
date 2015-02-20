package br.com.ufpb.projetopoo1;

public class Resposta {
	private int numResposta;
	private String resposta;
	private TipoQuestao tipo;
	public Resposta(int numQuestao, String resposta, TipoQuestao tipo){
		this.numResposta = numQuestao;
		this.resposta = resposta;
		this.tipo = tipo;
	}
	public TipoQuestao getTipo(){
		return tipo;
	}
	public void setTipo(TipoQuestao tipo){
		this.tipo = tipo;
	}
	public int getNumResposta(){
		return numResposta;
	}
	public void setNumResposta(int num){
		this.numResposta = num;
	}
	public String getResposta(){
		return resposta;
	}
	public void setResposta(String resposta){
		this.resposta = resposta;
	}
}