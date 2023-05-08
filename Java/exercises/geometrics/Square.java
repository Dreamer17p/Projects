public class Square extends Figure{
    double lado;
    VerificarLados verificador;
    public Square(double lado) throws Exception{
        this.lado = lado;
        this.verificador = new VerificarLados();
        this.verificador.verificarLados(lado);
    }
    @Override
    public double perimetro() {
        return lado*4;
    }
    @Override
    public double area() {
        double resultado = Math.pow(lado, 2);
        double resultadodouble = (double) resultado;
        return resultadodouble;
    }
    @Override
    public double volumen() {
        return 0; //Recordemos que el cuadrado no puede calcular volumen
    }
    @Override
    public boolean puedeCalcularVolumen() {
        return false;
    }
    @Override
    public String getNombreFigura() {
        return "Cuadrado";
    }

}
