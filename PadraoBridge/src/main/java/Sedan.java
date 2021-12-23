public class Sedan extends Carro  {


    private float potencia;

    public Sedan(float potencia) {
        this.potencia = potencia;
    }

    public String pintarSedan(){
        return "Sedan pintado de "+ this.cor.pintar();
    }
}
