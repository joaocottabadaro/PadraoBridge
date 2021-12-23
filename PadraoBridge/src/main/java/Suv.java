public class Suv extends  Carro{

    private float potencia;

    public Suv(float potencia) {
        this.potencia = potencia;
    }


    public String pintarSuv(){
        return "Suv pintado de " + this.cor.pintar();
    }
}
