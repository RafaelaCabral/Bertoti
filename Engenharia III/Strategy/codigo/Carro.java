public class Carro {
    private String modelo;
    private String placa;
    private Aluguel aluguel;

    public Carro(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    public void contratarAluguel() {
        if (aluguel != null) {
            aluguel.alugar();
        }
    }
}
