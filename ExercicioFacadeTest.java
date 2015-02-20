package br.com.ufpb.projetopoo1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
public class ExercicioFacadeTest {
	private ExercicioFacade exercicio;
	@Before
	public void setUp() throws Exception {
		this.exercicio = new ExercicioFacade();
	}
	@Test
	public void testCadastroDeProfessor() {
		try {
			exercicio.cadastrarProfessor("ayla", "123");
			Professor p = exercicio.pesquisaProfessorPelaMatricula("123");
			assertEquals("ayla", p.getNome());
			exercicio.cadastrarProfessor("ayla", "123");
			fail("Teveria ter lan�ado essa exce��o");
		} catch (ProfessorJaExisteException e) {
			System.out.println("De fato a exce��o � lan�ada");
		} catch (ProfessorInexistenteException e) {
			fail("n�o deve lan�ar essa exce��o");
		}
	}
	@Test
	public void testCadastroDeExercicio(){
		Exercicio e = new Exercicio();
		e.setNomeExercicio("exercicio1");
		e.cadastrarQuestao(1, "java � uma linguagem de alto nivel V ou F?", TipoQuestao.QUESTAO_V_OU_F);
		e.cadastrarRespostaDeQuestao(1, "v", TipoQuestao.QUESTAO_V_OU_F);
		this.exercicio.cadastrarExercicio(e);
		try {
			List<Exercicio> e2 = exercicio.listarExerc�ciosCadastrados();
			int quantExercicio = e2.size();
			assertTrue(1 == quantExercicio);
			Exercicio e1 = exercicio.pesquisarExercicio("exercicio1");
			List<Questao> q = e1.getQuestoes();
			int quantQuestao = q.size();
			assertTrue(1 == quantQuestao);
			assertEquals("java � uma linguagem de alto nivel V ou F?", q.get(0).getQuestao());
		} catch (ExercicioInexistenteException e1) {
			fail("n�o deve lan�a essa exce��o");
		}
	}
	
}