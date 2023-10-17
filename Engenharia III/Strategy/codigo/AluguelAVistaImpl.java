public class AluguelAVistaImpl implements AluguelAVista {
    private int alugarAVista;

    public void setAlugarAVista(int valor) {
        this.alugarAVista = valor;
    }

    @Override
    public void alugar() {
        System.out.println("Aluguel à vista de R$" + alugarAVista);
    }
}
