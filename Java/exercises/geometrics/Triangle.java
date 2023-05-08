public class Triangle extends Figure{
   double base;
   double ladoDere;
   double ladoIzqu;
   String tipo;
   VerificarLados verificador;
   public Triangle(double base, double ladoDere, double ladoIzqu) throws Exception{
    this.base = base;
    this.ladoDere = ladoDere;
    this.ladoIzqu = ladoIzqu;
    if (ladoDere == ladoIzqu && ladoIzqu == base) {
        tipo = "Equilatero";
    } else if (ladoDere == ladoIzqu || ladoDere == base || ladoIzqu == base) {
        tipo = "Isosceles";
    } else {
        tipo = "Escaleno";
    }
    this.verificador = new VerificarLados();
    this.verificador.verificarLados(base, ladoDere, ladoIzqu);
} 
@Override
public double perimetro(){
    double perimetro = base + ladoIzqu + ladoIzqu; 
    return perimetro;
} 

@Override
public double area() {
    double area;
    areasTriangulo areas = new areasTriangulo();
    area = areas.areaCualquierTriangulo(base, ladoDere, ladoIzqu);
    return area;
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
    if (tipo.equals("Equilatero")) {
        return "Triangulo equilatero";
    } 
    else if (tipo.equals("Isosceles")) {
        return "Triangulo isosceles";
    }
     else if (tipo.equals("Escaleno")) {
        return "Triangulo escaleno";
    } else {
        return "No coincide";
    }
}

}
