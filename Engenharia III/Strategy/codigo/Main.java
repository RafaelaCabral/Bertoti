public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Modelo X", "ABC-1234");

        AluguelParcelado aluguelParcelado = new AluguelParceladoImpl();
        aluguelParcelado.setValor(1000);
        aluguelParcelado.setParcelas(12);

        AluguelAVista aluguelAVista = new AluguelAVistaImpl();
        aluguelAVista.setAlugarAVista(9000);

        carro.setAluguel(aluguelParcelado);
        carro.contratarAluguel();

        carro.setAluguel(aluguelAVista);
        carro.contratarAluguel();
    }
}
