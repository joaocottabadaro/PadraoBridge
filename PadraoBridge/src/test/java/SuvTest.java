import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuvTest {

    @Test
    public void devePintarSuvVermelho() {
        Cor vermelho = new Vermelho();
        Suv suv=new Suv(450);
        suv.setCor(vermelho);
        assertEquals("Suv pintado de Vermelho",suv.pintarSuv());
    }

    @Test
    public void devePintarSuvAmarelo() {
        Cor amarelo = new Amarelo();
        Suv suv=new Suv(750);
        suv.setCor(amarelo);
        assertEquals("Suv pintado de Amarelo",suv.pintarSuv());

    }
}