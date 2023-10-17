public class Banco {
    private String titulo;
    private int ano;

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public boolean matches(Banco b) {
        return false;
    }
}