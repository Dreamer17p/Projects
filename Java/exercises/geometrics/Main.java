class Main {
    public static void main (String[] args) throws Exception{
        Cube cube1 = new Cube(10);
        cube1.perimetro();
        cube1.volumen();
        cube1.area();
        cube1.imprimirValores();

        System.out.println("\n");

        Cylinder cylinder1 = new Cylinder(2, 5);
        cylinder1.perimetro();
        cylinder1.volumen();
        cylinder1.area();
        cylinder1.imprimirValores();

        System.out.println("\n");

        Rectangle rectangle1 = new Rectangle(10, 4);
        rectangle1.perimetro();
        rectangle1.volumen();
        rectangle1.area(); 
        rectangle1.imprimirValores();

        System.out.println("\n"); 

        Square square1 = new Square(10);
        square1.perimetro();
        square1.volumen();
        square1.area();
        square1.imprimirValores();

        System.out.println("\n");

        Triangle triangle1 = new Triangle(10, 10, 10);
        triangle1.perimetro();
        triangle1.volumen();
        triangle1.area();
        triangle1.imprimirValores();
    }
}
