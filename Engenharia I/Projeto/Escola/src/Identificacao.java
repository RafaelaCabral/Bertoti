public class Identificacao {
	private String nome;
    private String professor;
    private String email;

    public Identificacao(String nome, String professor, String email) {
        this.nome = nome;
        this.professor = professor;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean comparar (Identificacao identificacao){
        if(this.email.equals(identificacao.email) && this.nome.equals(identificacao.nome) && this.professor.equals(identificacao.professor)){
            return true;
        }
        else{
            return false;
        }
    }
}
