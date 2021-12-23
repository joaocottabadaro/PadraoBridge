import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SedanTest {

    @Test
    public void devePintarSedanVermelho() {
        Cor vermelho = new Vermelho();
        Sedan sedan=new Sedan(550);
        sedan.setCor(vermelho);
        assertEquals("Sedan pintado de Vermelho",sedan.pintarSedan());
    }

    @Test
    public void devePintarSedanAmarelo() {
        Cor amarelo = new Amarelo();
        Sedan sedan=new Sedan(642);
        sedan.setCor(amarelo);
        assertEquals("Sedan pintado de Amarelo",sedan.pintarSedan());

    }
}