package br.com.ufpb.projetopoo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FeedbackFacadeTest {
	
	
	@Test
	public void testCadastraFeedback() {
		GerenteDeFeedback gerente = new GerenteDeFeedback();
		Exercicio exer = new Exercicio();
		exer.setNomeExercicio("Thread");
		
		Professor prof = new Professor("Diogo", "03");
		Aluno alun = new Aluno("Fernando","99");
		
		gerente.enviarFeedback(exer.getNomeExercicio(), alun.getMatricula(), "Parab�ns pela resposta correta!");//Enviando para o aluno
		gerente.enviarFeedback(exer.getNomeExercicio(), prof.getMatricula(), "Estava dif�cil, mas consegui!");// Para o prof.
		
		
		try {
			assertEquals("Parab�ns pela resposta correta!",gerente.pesquisaFeedback(exer.getNomeExercicio(), alun.getMatricula()));
			
			assertEquals("Estava dif�cil, mas consegui!", gerente.pesquisaFeedback(exer.getNomeExercicio(), prof.getMatricula()));
			
			assertTrue(prof.getNome()=="Diogo");
			
			assertTrue(prof.getMatricula()=="03");
			
			assertFalse(alun.getNome()!="Fernando");
			
			
		} catch (FeedbackInexistenteException e) {
			fail("Falhoou");
		}
		
	}

}
