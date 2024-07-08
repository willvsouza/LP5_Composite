public class Produto extends Pedido {

    private float valor;

    public Produto(String descricao, float valor) {
        super(descricao);
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getPedido() {
        return "Produto: " + this.getDescricao() + " - Valor: " + this.valor + "\n";
    }
}
