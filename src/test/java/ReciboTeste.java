import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReciboTeste {

    @Test
    void shouldReturnProdutoOfTheDay() {
        Caixa caixa1 = new Caixa("Amazon");

        Caixa caixa2 = new Caixa("Samsung");
        Produto produto21 = new Produto("Celular Galaxy s22", 3000.0f);
        caixa2.addPedido(produto21);

        Caixa caixa3 = new Caixa("Sony");
        Produto produto31 = new Produto("PS5", 4500.50f);
        Produto produto32 = new Produto("Controle PS5", 300.0f);
        caixa3.addPedido(produto31);
        caixa3.addPedido(produto32);


        caixa1.addPedido(caixa2);
        caixa1.addPedido(caixa3);


        Recibo recibo = new Recibo();
        recibo.setItem(caixa1);


        assertEquals("teste", recibo.getItem());
    }

    @Test
    void shouldReturnExceptionReciboWithoutProduto() {
        try  {
            Recibo recibo = new Recibo();
            recibo.getItem();
            fail();
        }
        catch (NullPointerException e)   {
            assertEquals("Recibo sem itens", e.getMessage());
        }
    }

}

