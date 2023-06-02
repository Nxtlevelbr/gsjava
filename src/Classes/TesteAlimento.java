package Classes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Date;

public class TesteAlimento {

    //@Test
    public void testGetId() {
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, null, 1.99);
        assertEquals(1, alimento.getId());
    }

    //@Test
    public void testSetId() {
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, null, 1.99);
        alimento.setId(2);
        assertEquals(2, alimento.getId());
    }

    //@Test
    public void testGetNome() {
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, null, 1.99);
        assertEquals("Maçã", alimento.getNome());
    }

    //@Test
    public void testSetNome() {
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, null, 1.99);
        alimento.setNome("Banana");
        assertEquals("Banana", alimento.getNome());
    }

    //@Test
    public void testGetValidade() {
        Date validade = new Date();
        Alimento alimento = new Alimento(1, "Maçã", validade, 10, null, null, 1.99);
        assertEquals(validade, alimento.getValidade());
    }

    @Test
    public void testSetValidade() {
        Date validade = new Date();
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, null, 1.99);
        alimento.setValidade(validade);
        assertEquals(validade, alimento.getValidade());
    }

    @Test
    public void testGetQuantidade() {
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, null, 1.99);
        assertEquals(10, alimento.getQuantidade());
    }

    @Test
    public void testSetQuantidade() {
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, null, 1.99);
        alimento.setQuantidade(20);
        assertEquals(20, alimento.getQuantidade());
    }

    @Test
    public void testGetFornecedor() {
        Fornecedor fornecedor = new Fornecedor("Fornecedor A", "rua abc");
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, fornecedor, null, 1.99);
        assertEquals(fornecedor, alimento.getFornecedor());
    }

    @Test
    public void testSetFornecedor() {
        Fornecedor fornecedor1 = new Fornecedor("Fornecedor A", "1234567890");
        Fornecedor fornecedor2 = new Fornecedor("Fornecedor B", "9876543210");
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, fornecedor1, null, 1.99);
        alimento.setFornecedor(fornecedor2);
        assertEquals(fornecedor2, alimento.getFornecedor());
    }

    @Test
    public void testGetCategoria() {
        Categoria categoria = new Categoria("Frutas");
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, categoria, 1.99);
        assertEquals(categoria, alimento.getCategoria());
    }

    //@Test
    public void testSetCategoria() {
        Categoria categoria1 = new Categoria("Frutas");
        Categoria categoria2 = new Categoria("Legumes");
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, categoria1, 1.99);
        alimento.setCategoria(categoria2);
        assertEquals(categoria2, alimento.getCategoria());
    }

    //@Test
    public void testGetValorUnitario() {
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, null, 1.99);
        assertEquals(1.99, alimento.getValorUnitario(), 0.01);
    }

    //@Test
    public void testSetValorUnitario() {
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, null, 1.99);
        alimento.setValorUnitario(2.99);
        assertEquals(2.99, alimento.getValorUnitario(), 0.01);
    }

    //@Test
    public void testRemoverQuantidade() {
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, null, 1.99);
        alimento.removerQuantidade(5);
        assertEquals(5, alimento.getQuantidade());
    }

    //@Test
    public void testCalcularValorTotal() {
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, null, 1.99);
        double valorTotal = alimento.calcularValorTotal(3);
        assertEquals(5.97, valorTotal, 0.01);
    }

    //@Test
    public void testSetTipo() {
        Categoria categoria = new Categoria("Frutas");
        Alimento alimento = new Alimento(1, "Maçã", new Date(), 10, null, categoria, 1.99);
        alimento.setTipo("Legumes");
        assertEquals("Legumes", categoria.getTipoAlimento());
    }
}

