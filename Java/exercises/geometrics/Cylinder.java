public class Cylinder extends Figure{
    double radio;
    double altura;
    VerificarLados verificador;

    public Cylinder(double radio, double altura) throws Exception{
        this.radio = radio;
        this.altura = altura;
        this.verificador = new VerificarLados();
    this.verificador.verificarLados(radio, altura);
    }
    @Override
    public double perimetro() {
        return (double) (2*Math.PI*radio);
    }

    @Override
    public double area() {
        return (double) (2*Math.PI*radio*(altura+radio));
    }

    @Override
    public double volumen() {
        return (double) (Math.PI*Math.pow(radio, 2)*altura);
    }
    @Override
    public boolean puedeCalcularVolumen() {
        return true;
    } 
    @Override
    public String getNombreFigura() {
        return "Cilindro";
    }
}
