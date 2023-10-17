import java.util.ArrayList;
import java.util.List;

public class Petrolifera {
    private double viscosidade;
    private double litragem;
    private double fluxo;
    private List<Observer> observerList = new ArrayList<>();

    public double setViscosidade(double viscosidade) {
        this.viscosidade = viscosidade;
    }

    public double setLitragem(double litragem) {
        this.litragem = litragem;
    }

    public double setFluxo(double fluxo) {
        this.fluxo = fluxo;
    }

    public void atualizacao() {
        for (Observer observer : observerList) {
            observer.atualizar(viscosidade, litragem, fluxo);
        }
    }

    public void addObserver(Observer ob) {
        observerList.add(ob);
    }
}
