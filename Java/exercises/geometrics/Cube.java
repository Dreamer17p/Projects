public class Cube extends Figure {
   double longitudLado;
   VerificarLados verificador;
    public Cube(double longitudLado) throws Exception{
        this.longitudLado = longitudLado;
        this.verificador = new VerificarLados();
        this.verificador.verificarLados(longitudLado);
    }
    @Override
    public double perimetro() {
        return (double)(12*longitudLado);    
    }

    @Override()
    public double area() {
        double resultado = 6*Math.pow(longitudLado, 2);
        double resultadodouble = (double)resultado;
        return resultadodouble;
    }

    @Override
    public double volumen() {
        double resultado = Math.pow(longitudLado, 3);
        double resultadodouble = (double)resultado;
        return resultadodouble;    

    }
    @Override
    public boolean puedeCalcularVolumen() {
        return true;
    }
    @Override
    public String getNombreFigura() {
        return "Cubo";
    } 
}
