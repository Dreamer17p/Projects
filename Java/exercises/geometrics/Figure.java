import java.text.DecimalFormat;

public abstract class Figure {
    public abstract double perimetro();
    public abstract double area();
    public abstract double volumen();
    public abstract boolean puedeCalcularVolumen();
    public abstract String getNombreFigura();
    DecimalFormat decimalesDespuesPunto = new DecimalFormat("#.###");

    public void imprimirValores() {
        String unidad = "cm";
        System.out.println("Nombre de la figura: " + getNombreFigura());
        System.out.println("Perimetro: " + decimalesDespuesPunto.format(perimetro()) + unidad);
        System.out.println("Area: " + decimalesDespuesPunto.format(area()) + unidad);
        if (puedeCalcularVolumen()) {
            System.out.println("Volumen: " + decimalesDespuesPunto.format(volumen()) + unidad);
        } else {
            System.out.println("Esta figura no tiene volumen.");
        }
    }
}
