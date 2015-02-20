package br.com.ufpb.projetopoo1;

public class Questao {
	private int numQuestao;
	private String questao;
	private TipoQuestao tipo;
	public Questao(int numQuestao, String questao, TipoQuestao tipo){
		this.numQuestao = numQuestao;
		this.questao = questao;
		this.tipo = tipo;
	}
	public TipoQuestao getTipo(){
		return tipo;
	}
	public void getTipo(TipoQuestao tipo){
		this.tipo = tipo;
	}
	public void setNumQuestao(int num){
		this.numQuestao = num;
	}
	public int getNumQuestao(){
		return numQuestao;
	}
	public void setQuestao(String questao){
		this.questao = questao;
	}
	public String getQuestao(){
		return questao;
	}
	public String toString(){
		return this.numQuestao+" Quest�o: "+this.questao;
	}
}


