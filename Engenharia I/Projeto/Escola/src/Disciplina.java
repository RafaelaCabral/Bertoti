public class Disciplina {
	private String codigo;
    private Identificacao iden;

    public Disciplina(String codigo, Identificacao iden) {
        this.codigo = codigo;
        this.iden = iden;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Identificacao getIden() {
        return iden;
    }

    public void setIden(Identificacao iden) {
        this.iden = iden;
    }
}
