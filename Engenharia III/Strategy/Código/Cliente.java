public class Cliente {
    private Comprar compra;

    public void setComprar (Comprar compra){
        this.compra = compra;
    }

    public void fazerCompra(){
        this.compra.comprar();
    }
}