public class areasTriangulo {
    int area;
    public double areaCualquierTriangulo(double base, double ladoIzqu, double ladoDere) {
        /* Se utiliza la forma de Herón:
         Área = √(s(s-a)(s-b)(s-c))
         s = semiperimetro
         (la formula Herón sirve para calcular el área de cualquier triangulo)
        */
        double semiperimetro = (base+ladoDere+ladoIzqu)/2;
        area = (int)(
            Math.sqrt( semiperimetro * (semiperimetro-base) * (semiperimetro-ladoDere) * (semiperimetro-ladoIzqu) )
            );
        return area;
    }
}
