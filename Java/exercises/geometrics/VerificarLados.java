public class VerificarLados {
    public void verificarLados(double... lados) throws Exception {
        for (double lado : lados) {
            if (lado > 10) {
                throw new Exception("El tamaño máximo permitido para los lados es de 10 cm.");
            }
        }
    }
}
