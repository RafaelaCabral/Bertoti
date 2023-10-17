public class Main {
    public static void main(String[] args) {
        Petrolifera petrolifera = new Petrolifera();

        Observer observer1 = new Observer() {
            @Override
            public void atualizar(double viscosidade, double litragem, double fluxo) {
                System.out.println("Observer 1 - Atualização: Viscosidade=" + viscosidade + ", Litragem=" + litragem + ", Fluxo=" + fluxo);
            }
        };

        Observer observer2 = new Observer() {
            @Override
            public void atualizar(double viscosidade, double litragem, double fluxo) {
                System.out.println("Observer 2 - Atualização: Viscosidade=" + viscosidade + ", Litragem=" + litragem + ", Fluxo=" + fluxo);
            }
        };

        petrolifera.addObserver(observer1);
        petrolifera.addObserver(observer2);

        petrolifera.setViscosidade(5.0);
        petrolifera.setLitragem(1000.0);
        petrolifera.setFluxo(200.0);

        petrolifera.atualizacao();
    }
}
