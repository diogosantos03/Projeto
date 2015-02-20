package br.com.ufpb.projetopoo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FeedbackFacadeTest {
	
	
	@Test
	public void testCadastraFeedback() {
		GerenteDeFeedback gerente = new GerenteDeFeedback();
		Exercicio exer = new Exercicio();
		Professor p = new Professor("Diogo", "03");
		Aluno a = new Aluno("Fernado","99");
		
		gerente.CadastarFeedback(exer.getNomeExercicio(), p.getMatricula(), "Parab�ns pela resposta correta!");
		gerente.CadastarFeedback(exer.getNomeExercicio(), a.getMatricula(), "Estava dif�cil, mas consegui!");
		
		try {
			assertEquals("Parab�ns pela resposta correta!",gerente.PesquisaFeedback(exer.getNomeExercicio(), p.getMatricula()));
			assertTrue("Parab�ns pela resposta correta!",gerente.PesquisaFeedback(exer.getNomeExercicio(), p.getMatricula()).startsWith("P"));
			
			assertEquals("Estava dif�cil, mas consegui!", gerente.PesquisaFeedback(exer.getNomeExercicio(), a.getMatricula()));
			
			
		} catch (FeedbackInexistenteException e) {
			fail("Falhoou");
		}
		
		try {
			assertFalse(gerente.PesquisaFeedback(exer.getNomeExercicio(), p.getMatricula())=="Parab�ns");
			assertFalse(gerente.PesquisaFeedback(exer.getNomeExercicio(), a.getMatricula())=="voc� errou as quest�es");
		} catch (FeedbackInexistenteException e) {
			fail("FeedBack inexistente!!");
		}
	}

}
