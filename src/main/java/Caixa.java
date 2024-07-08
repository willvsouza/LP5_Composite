import java.util.ArrayList;
import java.util.List;

public class Caixa extends Pedido {

    private List<Pedido> pedidos;

    public Caixa(String descricao) {
        super(descricao);
        this.pedidos = new ArrayList<Pedido>();
    }

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public String getPedido() {
        String str = "";
        str = "Caixa: " + this.getDescricao() + "\n";
        for (Pedido pedido : pedidos) {
            str += pedido.getPedido();
        }
        return str;
    }
}
