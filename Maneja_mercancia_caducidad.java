 package Paquete2;

public class Main {
    public static void main(String[] args) {
        ManejadorMercanciaCaducidad manejador = new ManejadorMercanciaCaducidad();

        MercanciaCaducidad mercancia1 = new MercanciaCaducidad("Leche", 2.5, "123", 12, 4, 2024);
        MercanciaCaducidad mercancia2 = new MercanciaCaducidad("Queso", 3.0, "456", 15, 4, 2024);
        manejador.agregarMercancia(mercancia1);
        manejador.agregarMercancia(mercancia2);

        String nombreABuscar = "Leche";
        MercanciaCaducidad mercanciaEncontrada = manejador.buscarMercanciaPorNombre(nombreABuscar);
        if (mercanciaEncontrada != null) {
            System.out.println("Mercancía encontrada: " + mercanciaEncontrada.getNombre());
            System.out.println("Caduca el " + mercanciaEncontrada.getDia() + "/" + mercanciaEncontrada.getMes() + "/" + mercanciaEncontrada.getAnio());
        } else {
            System.out.println("No se encontró la mercancía con nombre " + nombreABuscar);
        }
    }
}
