public class Recibo {

    private Pedido item;

    public void setItem (Pedido item) {
        this.item = item;
    }

    public String getItem () {
        if(this.item == null) {
            throw new NullPointerException("Recibo sem itens");
        }
        return this.item.getPedido();
    }
}