public class Rectangle extends Figure{
    double largo;
    double ancho;
    VerificarLados verificador;
    public Rectangle(double largo, double ancho) throws Exception{
        this.largo = largo;
        this.ancho = ancho;
        this.verificador = new VerificarLados();
        this.verificador.verificarLados(largo, ancho);
    }
    @Override
    public double perimetro() {
        return (2*largo + 2*ancho);
    }

    @Override
    public double area() {
        return largo*ancho;
    }

    @Override
    public double volumen() {
        return 0;    
}
    @Override
    public boolean puedeCalcularVolumen() {
    return false; 
 }
 @Override
 public String getNombreFigura() {
     return "Rectangulo";
 } 
}
