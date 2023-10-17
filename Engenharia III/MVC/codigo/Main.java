import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Banco banco1 = new Banco("Banco A", 2023);
        Banco banco2 = new Banco("Banco B", 2023);

        estoque.addBanco(banco1);
        estoque.addBanco(banco2);

        View view = new View();

        Titulo titulo = new Titulo() {
            @Override
            public void emitirTitulo() {
                System.out.println("Emitindo título...");
            }
        };
        view.setT(titulo);

        estoque.registerObserver(view);

        List<String> encontrados = new ArrayList<>();
        encontrados.add("Banco A");
        encontrados.add("Banco B");
        estoque.notifyObservers(encontrados);

        TituloEleitoral tituloEleitoral = new TituloEleitoral();
        tituloEleitoral.setV(view);
        tituloEleitoral.emitirTitulo();
    }
}
