public class AluguelParceladoImpl implements AluguelParcelado {
    private int valor;
    private int parcelas;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public void alugar() {
        System.out.println("Aluguel parcelado em " + parcelas + " vezes de R$" + valor + " por mês.");
    }
}
