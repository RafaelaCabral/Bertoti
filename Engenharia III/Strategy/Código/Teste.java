public class Teste{

    public static void main (String [] args){
        Comprar joao = new Comprar();

        joao.setComprar( new ComprarEmpresas());
        joao.fazerCompra();

        System.out.println("----------------------");

        joao.setComprar(new ComprarPessoaFisica());
        joao.fazerCompra();
    }
}