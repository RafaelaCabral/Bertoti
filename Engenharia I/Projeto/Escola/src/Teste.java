import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	public void test() {
		Escola escola = new Escola();
		assertEquals(escola.getDisciplinas().size(), 0);
		
		escola.cadastrarDisciplina(new Disciplina ("220060", new Identificacao("Contabilidade", "Fabio", "Fabio@gmail.com")));
		escola.cadastrarDisciplina(new Disciplina ("220061", new Identificacao("Engenharia de Software", "Giuliano", "Giuliano@gmail.com")));
		
		assertEquals(escola.getDisciplinas().size(), 2);
		
		Disciplina disciplinasEncontradas=escola.buscarDisciplinaPorCodigo("220061");
		
		assertEquals(disciplinasEncontradas.getIden().getNome(), "Engenharia de Software");
		
		List<Disciplina> disciplinaEncontradas= escola.buscarDisciplinaPorIdentificacao(new Identificacao("Contabilidade", "Fabio", "Fabio@gmail.com"));
		
		assertEquals(disciplinaEncontradas.get(0).getIden().getNome(), "Contabilidade");
	}

}