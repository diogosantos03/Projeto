package br.com.ufpb.projetopoo1;

public class Feedback {
	private String nomeExercicio;
	private String feedback;
	private String matricula;
	
	public Feedback(String NomeExer, String matricula, String comentario){
		this.nomeExercicio=NomeExer;
		this.matricula=matricula;
		this.feedback=comentario;
	}

	public String getNomeExercicio() {
		return nomeExercicio;
	}

	public void setNomeExercicio(String nomeExercicio) {
		this.nomeExercicio = nomeExercicio;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
