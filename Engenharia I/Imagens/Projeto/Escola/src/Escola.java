import java.util.LinkedList;
import java.util.List;

public class Escola {
	private List <Disciplina> disciplinas = new LinkedList<Disciplina>();

    public void cadastrarDisciplina(Disciplina disciplina){
         disciplinas.add(disciplina);
    }

    public List<Disciplina> buscarDisciplinaPorIdentificacao(Identificacao iden){
          List<Disciplina> disciplinasEncontradas = new LinkedList<Disciplina>();
          for(Disciplina disciplina:disciplinas){
               if(disciplina.getIden().comparar(iden)) disciplinasEncontradas.add(disciplina);
          }
          return disciplinasEncontradas;
    }

    public Disciplina buscarDisciplinaPorCodigo(String codigo){
         for(Disciplina disciplina:disciplinas){
              if(disciplina.getCodigo().equals(codigo)) 
                  return disciplina; 
         }
         return null;
    }

    public List<Disciplina> getDisciplinas(){
          return disciplinas;
    }
}
